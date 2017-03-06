package com.learn.saurabh.examples.multithread.sub.thread;

/**
 * Created by saurabhagrawal on 05/03/17.
 */
class MultiThreadsMain {
    public static void main(String[] a) {
        NewThreadMulti obj1=new NewThreadMulti("One");
        NewThreadMulti obj2=new NewThreadMulti("Two");
        NewThreadMulti obj3=new NewThreadMulti("Three");

        System.out.println("Thread One is alive: "+obj1.t.isAlive());
        System.out.println("Thread Two is alive: "+obj2.t.isAlive());
        System.out.println("Thread Three is alive: "+obj3.t.isAlive());

        System.out.println("wait for threads to finish");
        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();  //join is to ensure that main thread is last to stop

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted  " + e);
        }

        System.out.println("Thread One is alive: "+obj1.t.isAlive());
        System.out.println("Thread Two is alive: "+obj2.t.isAlive());
        System.out.println("Thread Three is alive: "+obj3.t.isAlive());

        System.out.println("Main thread exiting");

    }
}

class NewThreadMulti implements Runnable {
    String threadName;
    Thread t;

    NewThreadMulti(String threadName){
        this.threadName=threadName;
        this.t=new Thread(this,this.threadName);
        System.out.println("Child Thread:: "+t);
        t.start();  //start the thread
    }
    //this is entry point of second thread
    @Override
    public void run(){
        try {
            for (int i=5;i>0;i--){
                System.out.println(threadName+ " : " +i );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName+ " thread Interrupted :: "+e);
        }
        System.out.println(threadName + " Exiting");
    }
}


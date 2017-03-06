package com.learn.saurabh.examples.multithread.sub.thread;

/**
 * Created by saurabhagrawal on 05/03/17.
 */
class THreadRunnableDemo {
    public static void main(String[] a ){
        new NewThreadRunnable();  //create a new Thread

        try {
            for (int i=5;i>0;i--){
                System.out.println("Main Thread:: "+i );
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(" Main thread Interrupted :: "+e);
        }
        System.out.println("Exiting Main thread");
    }
}

class NewThreadRunnable implements Runnable {
    Thread thr;

    //create a new ,second thread
    NewThreadRunnable(){
        thr=new Thread(this," Demo Thread");
        System.out.println("Child Thread:: "+thr);
        thr.start();  //start the thread
    }

    //this is entry point of second thread
    @Override
    public void run(){
        try {
            for (int i=5;i>0;i--){
                System.out.println("Child Thread:: "+i );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(" Child thread Interrupted :: "+e);
        }
        System.out.println("Exiting Child thread");
    }
}

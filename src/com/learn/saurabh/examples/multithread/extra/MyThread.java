package com.learn.saurabh.examples.multithread.extra;

/**
 * Created by saurabhagrawal on 19/02/17.
 */
//The functionality of the Runnable is very simple. It computes a sum from the giving argument and it
// sleeps for a specified time.
public class MyThread implements Runnable {

    private String myName;
    private int count;
    private final long timeSleep;

    MyThread(String name, int newcount, long newtimeSleep) {
        this.myName = name;
        this.count = newcount;
        this.timeSleep = newtimeSleep;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        int sum = 0;
        for (int i = 1; i <= this.count; i++) {
            sum = sum + i;
        }
        System.out.println(myName + " thread has sum = " + sum +
                " and is going to sleep for " + timeSleep);
        try {
            Thread.sleep(this.timeSleep);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
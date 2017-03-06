package com.learn.saurabh.examples.multithread.sub.executors.pro2;

/**
 * Created by saurabhagrawal on 07/03/17.
 */
class TestOne implements Runnable {
    public void run() {
        while (true)
        {
            System.out.println("Executing task one");
            try
            {
                Thread.sleep(1000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

    }
}
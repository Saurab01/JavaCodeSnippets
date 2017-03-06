package com.learn.saurabh.examples.multithread.extra;

/**
 * Created by saurabhagrawal on 19/02/17.
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

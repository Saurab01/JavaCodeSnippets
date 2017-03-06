package com.learn.saurabh.examples.multithread.sub.executors.pro1;

import com.learn.saurabh.model.Student;

import java.util.concurrent.Callable;

/**
 * Created by saurabhagrawal on 19/02/17.
 */
 class ArchivePurgeCallable implements Callable<Student> {

    private int threadNumber;
    private String purge;

    public ArchivePurgeCallable(int threadNumber, String purge) {
        this.threadNumber = threadNumber;
        this.purge = purge;
    }

    //Entry point of callable and this code will execute asynchronously
    public Student call() throws Exception {
        System.out.println("Thread name: " +Thread.currentThread().getName() + " | Thread id: " + Thread.currentThread().getId() );
        return new Student(threadNumber,threadNumber+" "+purge,threadNumber*100,"password");
    }
}

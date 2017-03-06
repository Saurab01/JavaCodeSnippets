package com.learn.saurabh.examples.multithread.sub.executors.pro1;

import com.learn.saurabh.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 * Created by saurabhagrawal on 19/02/17.
 */
 class PurgeArchiveMain {

    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        try{

            List<Future<Student>> list=new ArrayList<Future<Student>>();

            //creating 5 threads
            for (int i=0;i<5;i++){
                //create callable interface instance and ssign it to user callable class
                Callable<Student> callable=new ArchivePurgeCallable(i,"purge");

                //submit callable tasks to be executed by thread pool
                Future<Student> future =executorService.submit(callable);

                //Add task result in list
                list.add(future);
            }
            //retrieve task result from future list
            for (Future<Student> future :list){
                System.out.println(future.get());
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (executorService!=null){
                executorService.shutdown();
            }
        }
    }
}

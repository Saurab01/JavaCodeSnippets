package com.personal.saurabh.java8.collections;

/**
 * Created by saurabhagrawal on 02/05/18.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
A new java.util.stream has been added in Java 8 to perform filter/map/reduce like operations with the collection.
Stream API will allow sequential as well as parallel execution. This is one of the best feature for me
because I work a lot with Collections and usually with Big Data, we need to filter out them based on some conditions.

Collection interface has been extended with stream() and parallelStream() default methods to get the Stream
for sequential and parallel execution. Let’s see their usage with simple example.
 */
public class StreamExample {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        /*
        Notice that parallel processing values are not in order, so parallel processing will be very helpful
        while working with huge collections.
         */
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High Nums parallel="+p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));

    }

}

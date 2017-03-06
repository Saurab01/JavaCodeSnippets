package com.learn.saurabh.examples.collections.main.sub.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by saurabhagrawal on 05/03/17.
 */
class PriorityQueueExamMain {
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println("Printing Elements");
        Iterator itr3=queue.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println("head:"+queue.element());  //It is used to retrieves, but does not remove, the head of this queue.
        //if no element :: NoSuchElementException
        System.out.println("head:"+queue.peek());
        //It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

        System.out.println("iterating the queue elements:");

        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.poll();
        queue.remove(); //It is used to retrieves and removes the head of this queue.
        queue.poll();//It is used to retrieves and removes the head of this queue,
        // or returns null if this queue is empty.

        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("************");
        System.out.println(queue.add("Saurabh")); //It is used to insert the specified element into this queue and
        // return true upon success.
        System.out.println(queue.offer("Agrawal"));//It is used to insert the specified element into this queue.


        System.out.println("************");
        Iterator<String> itr4=queue.iterator();
        while(itr4.hasNext()){
            System.out.println(itr4.next());
        }
    }
}

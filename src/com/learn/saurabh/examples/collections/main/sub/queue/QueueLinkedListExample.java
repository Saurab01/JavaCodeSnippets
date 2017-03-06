package com.learn.saurabh.examples.collections.main.sub.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by saurabhagrawal on 05/03/17.
 */
//The elements in PriorityQueue must be of Comparable type.
//The PriorityQueue class provides the facility of using queue.
// But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.
//public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable
public class QueueLinkedListExample {
    public static void main(String[] args) {
        Queue<Book> queue=new PriorityQueue<Book>();
        //Creating Books
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        //Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);

        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

        queue.remove();
        System.out.println("After removing one book record:");
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}



class Book implements Comparable<Book>{  //must to implemet Comparable for PriorityQueue
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(Book b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
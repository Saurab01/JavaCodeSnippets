package com.learn.saurabh.examples.generics.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public class GenericCollection {
    public static void main(String[] args) {
        //List<int> intList=new ArrayList<>();   //primitive not allowed
        //List<Integer> intList=new ArrayList<>();  //allowed

        List<Object> list1 = new ArrayList<Object>();
        //List<Object> list13 = new ArrayList<Integer>();   //not allowed
        list1.add(100);  //Integer or String both Allowed as Object
        list1.add(200);
        list1.add("abc");
        System.out.println("list1::::"+list1);

        /*List<?> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add("abc");
        System.out.println("list2::::"+list2);*/

        List list3 = new ArrayList<Integer>();
        list3.add(100);
        list3.add(200);
        list3.add("abc");
        System.out.println("list3::::"+list3);


		/*ArrayList<? extends Object> list4 = new ArrayList<Integer>();
		list4.add(100);
		list4.add(200);
		//list1.add("abc");
		System.out.println("list1::::"+list4);*/

    }

}

package com.learn.saurabh.examples.generics.main;

import com.learn.saurabh.examples.generics.sub.genericMethodOrConstructor.Dimension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public class GenericsMethodOrConstructorMain {
    public static void main(String[] args) {
        Dimension<String> d1=new Dimension<String>("len1","wid1","hei1");
        //Dimension<String>  just one time   and not Dimension<String,String,String>
        //new Dimension<String> is gud to have
        Dimension<Integer> d2=new Dimension<Integer>(1,2,3);
        Dimension<Integer> d3=new Dimension<Integer>(1,2,3);
        Dimension<Integer> d4=new Dimension<Integer>(10,20,30);

        List<Dimension> list=new ArrayList<>();
        //List<T> not defined
        list.add(d1);   //String can also come.
        list.add(d2);
        list.add(d3);
        list.add(d4);


        System.out.println("return value::: "+new GenericsMethodOrConstructorMain().countAllOccurrences(list,d2));
        System.out.println("return value::: "+new GenericsMethodOrConstructorMain().countAllOccurrences(list,d1));
        System.out.println("return value::: "+new GenericsMethodOrConstructorMain().countAllOccurrences(list,null));
        System.out.println("***********");

        System.out.println("Generics with Array");

        new GenericsMethodOrConstructorMain().genericArray();
        System.out.println("***********");

    }

    private <T> void genericArray() {   //<T> is passed as to be used for T[] array
        Object[] array = new String[]{"one","two","three"};    //Parent Object given
        System.out.println(Arrays.toString(array));

        //T[] array2=new T[]{"one","two","three",1,23,4};
        //System.out.println(Arrays.toString(array2));

    }

    private <T> int countAllOccurrences(List<T> list, T item) {  //<T> is required
        int count = 0;
        if (item == null) {
            for ( T listItem : list )
                if (listItem == null)
                    count++;
        }
        else {
            for ( T listItem : list )
                if (item.equals(listItem))
                    count++;
        }
        return count;
    }
}

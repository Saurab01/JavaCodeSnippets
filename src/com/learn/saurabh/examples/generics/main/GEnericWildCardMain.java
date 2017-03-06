package com.learn.saurabh.examples.generics.main;

import java.util.Arrays;
import java.util.List;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public class GEnericWildCardMain {
    public static void main(String[] args) {

        //List of Integers
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        System.out.println(sum(ints));

        //List of Doubles
        List<Double> doubles = Arrays.asList(1.5d,2d,3d);
        System.out.println(sum(doubles));

        List<String> strings = Arrays.asList("1","2","3");
        //This will give compilation error as :: The method sum(List&lt;? extends Number&gt;) in the
        //type GenericsExample&lt;T&gt; is not applicable for the arguments (List&lt;String&gt;)
        //System.out.println(sum(strings));

    }

    //Method will accept
    private static Number sum (List<? extends Number> numbers){
        //List<? extends Number> denotes all list types where the element type is a subtype of Number.
        double s = 0.0;
        for (Number n : numbers)
            s += n.doubleValue();
        return s;
    }
}
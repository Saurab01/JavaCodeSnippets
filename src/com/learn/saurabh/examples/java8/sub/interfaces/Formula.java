package com.learn.saurabh.examples.java8.sub.interfaces;

/**
 * Created by saurabhagrawal on 06/03/17.
 */
public interface Formula{

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
    static double square(int a){
        return a*a;
    }
}

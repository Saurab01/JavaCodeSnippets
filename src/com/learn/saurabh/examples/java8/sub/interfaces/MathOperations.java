package com.learn.saurabh.examples.java8.sub.interfaces;

/**
 * Created by saurabhagrawal on 07/03/17.
 */
public class MathOperations implements Formula{
    public static void main(String[] a){
        MathOperations mathOperations=new MathOperations();
        System.out.println(mathOperations.calculate(100));
        System.out.println(mathOperations.sqrt(100));
        //System.out.println(sqrt(100)); //non-static method can't ne referenced from static
        //System.out.println(MathOperations.square(100));  //static method can be invoked using interface only
        System.out.println(Formula.square(100));  //static method
    }

    @Override
    public double calculate(int a) {
        return sqrt(a*100);    //direct called method
    }

}

package com.learn.saurabh.examples.generics.sub.genericClassorInterface;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public interface DemoInterface<T1,T2> {   //two types can be passed
    T2 doSomeOperation(T1 t);
    T1 doReverseOperation(T2 t);
}

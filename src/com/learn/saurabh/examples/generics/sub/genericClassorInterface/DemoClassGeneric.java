package com.learn.saurabh.examples.generics.sub.genericClassorInterface;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public class DemoClassGeneric<T> {
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}

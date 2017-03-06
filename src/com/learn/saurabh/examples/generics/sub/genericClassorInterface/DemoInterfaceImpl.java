package com.learn.saurabh.examples.generics.sub.genericClassorInterface;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public class DemoInterfaceImpl implements DemoInterface<String,Integer> {  //two types passed

    @Override
    public Integer doSomeOperation(String t) {
        return Integer.parseInt(t);
    }

    @Override
    public String doReverseOperation(Integer t) {
        return String.valueOf(t);
    }
}

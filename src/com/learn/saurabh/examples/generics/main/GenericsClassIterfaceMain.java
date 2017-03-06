package com.learn.saurabh.examples.generics.main;

import com.learn.saurabh.examples.generics.sub.genericClassorInterface.DemoClass;
import com.learn.saurabh.examples.generics.sub.genericClassorInterface.DemoClassGeneric;
import com.learn.saurabh.examples.generics.sub.genericClassorInterface.DemoInterface;
import com.learn.saurabh.examples.generics.sub.genericClassorInterface.DemoInterfaceImpl;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public class GenericsClassIterfaceMain {
    public static void main(String[] args) {

        //new GenericsClassIterfaceMain().generics1();
        //new GenericsClassIterfaceMain().genericswithTypeClass();
        new GenericsClassIterfaceMain().genericsinInterface();
    }

    private void generics1() {
        System.out.println("generics1 with Object parameter");
        DemoClass democlass=new DemoClass();
        democlass.set("saurabh");
        System.out.println(democlass.get());
        democlass.set(123);  //String or Integer any allowed as Object is passed in constructor
        System.out.println(democlass.get());
        System.out.println("***********");
    }
    private void genericswithTypeClass() {
        System.out.println("generics1 with Type parameter");
        DemoClassGeneric dem0=new DemoClassGeneric();   //not best way
        dem0.set(1);
        System.out.println(dem0.get());
        dem0.set("Helllo");
        System.out.println(dem0.get());

        System.out.println("generics1 with Integer parameter");
        DemoClassGeneric<Integer> dem1=new DemoClassGeneric<>();   // best way
        dem1.set(1);
        System.out.println(dem1.get());
        //dem1.set("Helllo");  ////This will raise compile time error
        System.out.println(dem1.get());
        System.out.println("***********");

    }

    private void genericsinInterface() {
        System.out.println("generics with interface");
        DemoInterface demo=new DemoInterfaceImpl();

        System.out.println(demo.doSomeOperation("23"));
        System.out.println(demo.doReverseOperation(23));

        //System.out.println(demo.doSomeOperation(45));
        //System.out.println(demo.doReverseOperation("45"));  //ClassCastException as in subclass opposite

        System.out.println("***********");

    }

}

package com.learn.saurabh.examples.generics.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public class GenericsExampleMain {
    public static void main(String[] args)
    {
        //List of grand children
        List<GrandChildClass> grandChildren = new ArrayList<GrandChildClass>();
        grandChildren.add(new GrandChildClass());
        addGrandChildren(grandChildren);

        //List of grand childs
        List<ChildClass> childs = new ArrayList <ChildClass>();
        childs.add(new GrandChildClass());
        addGrandChildren(childs);

        //List of grand supers
        List<SuperClass> supers = new ArrayList<SuperClass>();
        supers.add(new GrandChildClass());
        addGrandChildren(supers);
    }

    public static void addGrandChildren(List<? super GrandChildClass> grandChildren)
    {
        grandChildren.add(new GrandChildClass());
        System.out.println(grandChildren);
    }
}
//Here problem is that GrandChildClass is subtype of ChildClass and SuperClass as well. So any generic list of
// SuperClasses and ChildClasses is capable of holding GrandChildClasses as well.
// Here we must take help of lower bound wildcard using ‘super‘ keyword.

class SuperClass{

}
class ChildClass extends SuperClass{

}
class GrandChildClass extends ChildClass{

}
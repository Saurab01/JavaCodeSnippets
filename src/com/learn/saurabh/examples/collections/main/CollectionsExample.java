package com.learn.saurabh.examples.collections.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by saurabhagrawal on 16/02/17.
 */
public class CollectionsExample {
    public static void main (String [] args) {
        TreeSet hs=new TreeSet ();
        System.out.println ("CONTENTS OF hs = "+hs);
        System.out.println ("SIZE OF hs = "+hs.size ());
        hs.add (new Integer (17));
        hs.add (new Integer (188));
        hs.add (new Integer (-17));
        hs.add (new Integer (20));
        //hs.add (new String ("Saurabh"));
        hs.add (new Integer (200));
        hs.add (new Integer (177));
        //hs.add (new String ("Agrawal"));
        System.out.println ("CONTENTS OF hs = "+hs);
        System.out.println ("SIZE OF hs = "+hs.size ());

        Iterator itr=hs.iterator ();
        while (itr.hasNext ())
        {
            Object obj=itr.next ();
            System.out.println (obj);
        }
    }
}

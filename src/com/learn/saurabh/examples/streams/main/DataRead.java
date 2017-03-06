package com.learn.saurabh.examples.streams.main;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Write a JAVA program to read two numbers from keyboard and display their product
public class DataRead {
    public static void main (String [] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter first number : ");
            int s1 = dis.readInt();
            System.out.println("Enter second number : ");
            int s2 = dis.readInt();

            int n3 = s1 * s2;
            System.out.println("Product = " + n3);
        } catch (FileNotFoundException fnfe) {
            System.out.println("FILE DOES NOT EXISTS");
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}

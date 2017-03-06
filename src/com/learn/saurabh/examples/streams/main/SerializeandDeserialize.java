package com.learn.saurabh.examples.streams.main;

import com.learn.saurabh.model.Student;

import java.io.*;

/**
 * Created by saurabhagrawal on 16/02/17.
 */
//Serialization is the process of saving the state of the object permanently in the form of a file.
public class SerializeandDeserialize {
    public static void main (String [] args) {
        Student student=new Student(10,"Saurabh",100,"password");
        System.out.println("Student before serializable"+student);

        String fileName="hello.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(student);
            System.out.println("STUDENT DATA IS SERIALIZED");
            fileOutputStream.close();
            oos.close();


            //deserialization
            /*
            At the most primitive level, you are reading bits in from a file which the FileInputStream is able to do.
             This is then filtered through the ObjectInputStream which translates these bits into Java objects,
              but does not know the actual type of the object created, which is why you must
              cast the object as a Student
             */
            Student newStudent;
            FileInputStream fis=new FileInputStream (fileName);
            ObjectInputStream ois=new ObjectInputStream (fis);
            Object obj=ois.readObject ();
            newStudent= (Student) obj;
            System.out.println("STUDENT DATA IS DESERIALIZED");
            System.out.println(newStudent);

        } catch (IOException ioe) {
            System.out.println ("PROBLEM IN CREATING THE FILE   "+ioe);
        }
        catch (Exception e)
        {
            System.out.println (e);
        }

    }
}

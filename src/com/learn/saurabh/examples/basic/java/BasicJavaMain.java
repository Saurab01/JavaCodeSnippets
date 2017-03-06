package com.learn.saurabh.examples.basic.java;

import com.learn.saurabh.model.Student;

/**
 * Created by saurabhagrawal on 26/02/17.
 */
public class BasicJavaMain {

    Student stu1=new Student(1,"saurabh",100,"pass");
    Student stu1_copy=new Student(1,"saurabh",100,"pass");
    Student stu2=new Student(2,"agrawal",90,"pass2");
    Student stu3=new Student(3,"ilu",80,"pass3");

    public static void main(String[] args){

        BasicJavaMain basicJavaMain=new BasicJavaMain();
        //basicJavaMain.checkEquals();   //equals vs ==
        //basicJavaMain.equalsVsHashcode();
        //basicJavaMain.compareVScompareTO();
        basicJavaMain.cre();

    }

    private void cre() {
        System.out.println("SORRY SUU");
        System.out.println("Thappad maar muje");
        System.out.println("aaj SUNDAY hai");
        System.out.println("hum roj ladeinge bas SUNDAY ko break deinge");
        System.out.println("daal chawal pyar se banaunga abhi");
        System.out.println("abhi khayeinge");
        System.out.println("phir JAVA padeinge");
        System.out.println("sorry SUU");
    }

    private void compareVScompareTO() {
    }

    private void equalsVsHashcode() {
        System.out.println(stu1.equals(stu1_copy));
        System.out.println(stu1.hashCode());
        System.out.println(stu1_copy.hashCode());
        System.out.println("If obj1.equals(obj2) is true, then obj1.hashCode() should be equal to obj2.hashCode()");
        /*If obj1.equals(obj2) is true, then obj1.hashCode() should be equal to obj2.hashCode()
	•	obj.hashCode() should return the same value when run multiple times, if values of obj used in  equals()
	have not changed.
	•	If obj1.equals(obj2) is false, it is NOT required that obj1.hashCode() is not equal to obj2.hashCode().
	Two unequal objects MIGHT have the same hashCode. */
    }

    private void checkEquals() {
        System.out.println(stu1.equals(stu1_copy));
        System.out.println(stu1==stu1_copy);
        Student stu1_new=stu1;
        System.out.println(stu1.equals(stu1_new));
        System.out.println(stu1==stu1_new);

    }
}

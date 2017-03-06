package com.learn.saurabh.model;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by saurabhagrawal on 16/02/17.
 */
public class Student  implements Serializable,Comparator{
    int stno;
    String sname;
    float marks;
    transient String password;  //Now it will not be serialized

    public Student(int stno, String sname, float marks, String password) {
        this.stno = stno;
        this.sname = sname;
        this.marks = marks;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stno=" + stno +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                ", password='" + password + '\'' +
                '}';
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getStno() != student.getStno()) return false;
        if (Float.compare(student.getMarks(), getMarks()) != 0) return false;
        if (!getSname().equals(student.getSname())) return false;
        return password != null ? password.equals(student.password) : student.password == null;

    }

    @Override
    public int hashCode() {
        int result = getStno();
        result = 31 * result + getSname().hashCode();
        result = 31 * result + (getMarks() != +0.0f ? Float.floatToIntBits(getMarks()) : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }







    //getters and setters
    public int getStno() {
        return stno;
    }

    public void setStno(int stno) {
        this.stno = stno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}

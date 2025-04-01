package com.content.java.core.oops;


import java.util.Objects;

public class Student {
    int rollNo;
   String FirstName;
    String dept;
    String [] subjects;

    public void setRollNo(int id) {
        this.rollNo = id;
    }

    public void setFirstName(String test) {
        this.FirstName = test;
    }

    public void setDept(String root) {
        this.dept = root;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getDept() {
        return dept;
    }

    public String[] getSubjects() {
        return subjects;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }if(object == null || getClass() !=object.getClass()){
            return false;
        }
        Student student = (Student) object;
        return dept == student.dept;
    }

    @Override
    public int hashCode(){
        return Objects.hash(FirstName);
    }


}

package com.geekster.SpringAnnotation;

public class Student {
    private String name;
    public Student(){
        System.out.println("Student called from Spring framework-1 ");
    }
    public Student(String name) {
        this.name = name;
        System.out.println("Student called from Spring framework-2 "+ this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

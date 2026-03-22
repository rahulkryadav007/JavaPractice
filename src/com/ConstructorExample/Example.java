package com.ConstructorExample;

class Student2 {

    Student2() {
        this(101);   // calling parameterized constructor
        System.out.println("Default Constructor");
    }

    Student2(int id) {
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Student2 s = new Student2();
    }
}
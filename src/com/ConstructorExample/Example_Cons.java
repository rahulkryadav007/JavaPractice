package com.ConstructorExample;

class Student {
    int id;
    String name;

    // Default Constructor
    Student() {
        id = 101;
        name = "Rahul";
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();  // constructor call
        s1.display();
    }
}
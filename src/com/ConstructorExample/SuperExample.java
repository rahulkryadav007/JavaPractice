package com.ConstructorExample;

class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    Dog() {
        super();   // calling parent constructor
        System.out.println("Dog Constructor");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
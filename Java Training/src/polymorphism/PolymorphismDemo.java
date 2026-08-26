package polymorphism;
class Calculator { int add(int a,int b){return a+b;} int add(int a,int b,int c){return a+b+c;} }
class Animal { void sound(){System.out.println("Animal sound");} } class Dog extends Animal { @Override void sound(){System.out.println("Dog barks");} }
public class PolymorphismDemo { public static void main(String[] args){Calculator c=new Calculator();System.out.println(c.add(10,20));System.out.println(c.add(10,20,30));Animal a=new Dog();a.sound();} }

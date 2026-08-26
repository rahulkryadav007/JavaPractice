package interfaces;
interface Animal { void sound(); }
class Dog implements Animal { public void sound(){System.out.println("Dog barks");} }
class Cat implements Animal { public void sound(){System.out.println("Cat meows");} }
public class InterfaceDemo { public static void main(String[] args){Animal a=new Dog();a.sound();a=new Cat();a.sound();} }

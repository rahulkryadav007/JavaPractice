package inheritance;
class Animal { void eat(){System.out.println("Eating");} }
class Dog extends Animal { void bark(){System.out.println("Barking");} }
class Puppy extends Dog { void play(){System.out.println("Playing");} }
public class InheritanceDemo { public static void main(String[] args){Puppy p=new Puppy();p.eat();p.bark();p.play();} }

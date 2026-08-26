package oops;
class Student { String name; int age; Student(){name="Unknown";age=0;} Student(String n,int a){name=n;age=a;} void show(){System.out.println(name+" "+age);} }
public class ConstructorDemo { public static void main(String[] args){ new Student().show(); new Student("Rahul",25).show(); } }

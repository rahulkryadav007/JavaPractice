package generics;
class Box<T>{ private T value; void set(T value){this.value=value;} T get(){return value;} }
public class GenericsDemo { public static void main(String[] args){Box<Integer> b=new Box<>();b.set(100);System.out.println(b.get());} }

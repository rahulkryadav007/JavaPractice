package methods;
public class MethodDemo {
    static int add(int a,int b){ return a+b; }
    static void greet(String name){ System.out.println("Hello "+name); }
    public static void main(String[] args){ greet("Student"); System.out.println(add(10,20)); }
}

package Exception;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b;   // ❌ Exception here
        System.out.println(result);
    }
}
package Exception;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int num = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

package Exception;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            int salary = 2000;

            if (salary < 5000) {
                throw new MyException("Salary too low!");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
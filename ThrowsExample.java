package Exception;

import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        try {
            System.out.println("Enter amount to withdraw:");
            int amount = sc.nextInt();

            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance!");
            }

            balance = balance - amount;
            System.out.println("Withdraw Successful!");
            System.out.println("Remaining Balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter number.");
        }

        sc.close();
    }
}
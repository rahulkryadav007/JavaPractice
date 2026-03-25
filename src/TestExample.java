package Exception;

import java.util.Scanner;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner sc  = new Scanner(System.in);
		try {
		     System.out.println("Enter a number:");
		     int n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("You are giving input String");
		}

	}

}

package Interview;
import java.util.Scanner;

public class NthLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Which largest element you want? ");
        int k = sc.nextInt();

        if(k > n){
            System.out.println("Invalid value of k");
            return;
        }

        // Bubble Sort Descending
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {

                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(k + "th largest element is: " + arr[k-1]);
    }
}


import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number.");
        } else {
            int[] a = new int[n];

            if (n > 0) {
                a[0] = 0;
            }

            if (n > 1) {
                a[1] = 1;
            }

            for (int i = 2; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }

            System.out.print("Fibonacci Series: ");

            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);

                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
        }

        sc.close();
    }
}

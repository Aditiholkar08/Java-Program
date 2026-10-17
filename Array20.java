
import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size must be positive");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int pos = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                pos = i;
            }
        }

        System.out.println("Maximum number in the array is found at "
                + "index " + pos + " is " + max);
        sc.close();
    }
}
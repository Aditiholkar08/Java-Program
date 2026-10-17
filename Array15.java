
import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sum += a[i];
            }
        }

        System.out.println("Sum of odd indexed elements: " + sum);
        sc.close();
    }
}
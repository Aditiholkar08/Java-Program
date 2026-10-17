
import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int product = 1;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                product *= a[i];
            }
        }

        System.out.println("Product of odd indexed elements: "
                + product);
        sc.close();
    }
}
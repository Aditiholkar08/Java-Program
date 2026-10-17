
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 4 == 0) {
                System.out.println(a[i]
                        + " is divisible by 4 and its index is " + i);
            }
        }
        sc.close();
    }
}
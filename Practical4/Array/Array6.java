
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        char[] a = new char[n];

        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().charAt(0);
        }

        System.out.println("Characters are:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        char[] a = new char[n];

        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(a[i]);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                System.out.println("Vowel " + a[i]
                        + " found at index " + i);
            }
        }
        sc.close();
    }
}
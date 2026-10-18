
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        char ch = 'A';

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (ch % 2 == 1)
                    System.out.print(ch + " ");
                else
                    System.out.print(Character.toLowerCase(ch) + " ");

                ch++;
            }
            System.out.println();
        }
    }
}

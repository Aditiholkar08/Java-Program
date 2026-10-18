
import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch;

            if (i % 3 == 1) {
                ch = '#';
            } else if (i % 3 == 2) {
                ch = '$';
            } else {
                ch = '@';
            }

            for (int j = 1; j <= n; j++) {
                System.out.print(ch + "  ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = n - i + 1;
            char ch;

            if (i % 2 == 1) {
                ch = (char) ('A' + count - 1);
            } else {
                ch = (char) ('a' + count - 2);
            }

            for (int j = 1; j <= count; j++) {
                System.out.print(ch + "  ");
                ch--;
            }
            System.out.println();
        }
    }
}
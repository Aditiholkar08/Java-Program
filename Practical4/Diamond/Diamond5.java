
import java.util.Scanner;

class Diamond5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int r = (i <= n) ? i : 2 * n - i;

            for (int s = 1; s <= n - r; s++)
                System.out.print("  ");

            char ch = (char) ('a' + r - 1);

            for (int j = 1; j <= 2 * r - 1; j++)
                System.out.print(ch + " ");

            System.out.println();
        }
        sc.close();
    }
}

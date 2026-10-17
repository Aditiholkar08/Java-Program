
import java.util.Scanner;

class Diamond10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int r = (i <= n) ? i : 2 * n - i;

            for (int s = 1; s <= n - r; s++)
                System.out.print("  ");

            for (int j = 0; j < r; j++)
                System.out.print((r + j) + " ");

            for (int j = r - 2; j >= 0; j--)
                System.out.print((r + j) + " ");

            System.out.println();
        }
        sc.close();
    }
}

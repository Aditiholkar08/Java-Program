
import java.util.Scanner;

class Diamond7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int r = (i <= n) ? i : 2 * n - i;

            for (int s = 1; s <= n - r; s++)
                System.out.print("  ");

            for (int j = r; j >= 1; j--)
                System.out.print(j + " ");

            for (int j = 2; j <= r; j++)
                System.out.print(j + " ");

            System.out.println();
        }
        sc.close();
    }
}

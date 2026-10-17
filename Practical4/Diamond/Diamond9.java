
import java.util.Scanner;

class Diamond9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int r = (i <= n) ? i : 2 * n - i;
            int value = (i <= n) ? i : 2 * n - i + 1;

            for (int s = 1; s <= n - r; s++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * r - 1; j++)
                System.out.print(value * j + " ");

            System.out.println();
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Diamond10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (1-26): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + n - j);
                System.out.print(ch + " ");
            }

            for (int j = 2; j <= i; j++) {
                char ch = (char) ('A' + n - i + j - 1);
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + n - j);
                System.out.print(ch + " ");
            }

            for (int j = 2; j <= i; j++) {
                char ch = (char) ('A' + n - i + j - 1);
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }

}

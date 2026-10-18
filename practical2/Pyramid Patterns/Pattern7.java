import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++)
                System.out.print("  ");

            for (int j = n - i + 1; j <= n; j++)
                System.out.print((char) ('A' + j - 1) + "  ");

            for (int j = n - 1; j >= n - i + 1; j--)
                System.out.print((char) ('A' + j - 1) + "  ");

            System.out.println();
        }
    }

}

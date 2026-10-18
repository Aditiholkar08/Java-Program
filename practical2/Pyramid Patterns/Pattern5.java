import java.util.Scanner;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i % 2 == 1)
                    System.out.print(i + "  ");
                else
                    System.out.print((char) ('A' + i - 1) + "  ");
            }

            System.out.println();
        }
    }

}

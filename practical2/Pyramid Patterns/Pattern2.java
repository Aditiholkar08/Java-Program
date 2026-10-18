import java.util.Scanner;

class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++)
                System.out.print("  ");

            for (int j = 1; j <= 2 * i + 1; j++)
                System.out.print((char) ('A' + i) + "  ");

            System.out.println();
        }
    }

}

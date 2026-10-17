
import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();

        if (r <= 0 || c <= 0) {
            System.out.println("Rows and columns must be positive");
            sc.close();
            return;
        }

        int[][] a = new int[r][c];

        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Corner elements:");
        System.out.println(a[0][0] + "\t" + a[0][c - 1]);
        System.out.println(a[r - 1][0] + "\t" + a[r - 1][c - 1]);

        sc.close();
    }
}
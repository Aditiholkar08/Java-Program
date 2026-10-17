
import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();

        if (r != c || r == 0) {
            System.out.println("Enter a square array");
            sc.close();
            return;
        }

        int[][] a = new int[r][c];
        int primarySum = 0;
        int secondarySum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            primarySum += a[i][i];
            secondarySum += a[i][r - 1 - i];
        }

        int product = primarySum * secondarySum;

        System.out.println("Product of Sum of Primary and "
                + "Secondary Diagonal: " + product);
        sc.close();
    }
}

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == n && j == 1)
                    System.out.print("A ");
                else if (i == n && j == 2)
                    System.out.print("b ");
                else if (i == n && j == 3)
                    System.out.print("C ");
                else if (i == n - 1)
                    System.out.print(j + " ");
                else
                    System.out.print("C ");
            }
            System.out.println();
        }
    }
}

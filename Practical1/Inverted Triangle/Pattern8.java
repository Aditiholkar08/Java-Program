
import java.util.Scanner;

class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = n - i + 1;

            if (i % 2 == 1) {
                for (int j = count; j >= 1; j--) {
                    System.out.print(j + "  ");
                }
            } else {
                for (int j = count - 1; j >= 1; j--) {
                    System.out.print((char) ('A' + j - 1) + "  ");
                }
            }
            System.out.println();
        }
    }
}
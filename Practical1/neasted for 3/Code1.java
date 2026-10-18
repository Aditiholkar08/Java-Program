
import java.util.Scanner;

class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) ('A' + i) + "  ");
            }
            System.out.println();
        }
    }
}
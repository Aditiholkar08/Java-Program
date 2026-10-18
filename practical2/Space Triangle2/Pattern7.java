
import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                int num = i * i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num++ + " ");
                }
            } else {
                char ch = (char) ('A' + i / 2 - 1);
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}
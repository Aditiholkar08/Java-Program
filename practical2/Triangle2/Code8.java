
import java.util.Scanner;

class Code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print((i - j + 1) + " ");
                } else {
                    char ch = (char) ('A' + i - j - 1);
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}
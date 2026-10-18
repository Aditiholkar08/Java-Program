
import java.util.Scanner;

class Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                if (i % 2 == 1) {
                    System.out.print(j + " ");
                } else {
                    char ch = (char) ('A' + j - 1);
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int pos = j - i + 1;

                if (pos % 2 == 1) {
                    System.out.print((char) ('A' + j - 1) + "  ");
                } else {
                    System.out.print((65 + j) + "  ");
                }
            }
            System.out.println();
        }
    }
}
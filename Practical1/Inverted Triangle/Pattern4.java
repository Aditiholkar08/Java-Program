
import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        char ch = (char) ('A' + n * (n + 1) / 2 - 1);

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(ch + "  ");
                ch--;
            }
            System.out.println();
        }
    }
}
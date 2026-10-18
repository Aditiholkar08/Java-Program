
import java.util.Scanner;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = (i % 2 == 1) ? 'A' : 'a';

            for (int j = i; j <= n; j++) {
                System.out.print(ch + "  ");
                ch++;
            }
            System.out.println();
        }
    }
}
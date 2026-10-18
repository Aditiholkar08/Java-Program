
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        char ch = 'a';

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print(j - i + 1 + " ");
                }
            }
            System.out.println();
        }
    }
}

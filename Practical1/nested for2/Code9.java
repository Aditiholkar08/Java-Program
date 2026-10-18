
import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int num;

                if (i % 2 != 0) {
                    num = j;
                } else {
                    num = n - j + 1;
                }

                char ch = (char) ('A' + num - 1);
                System.out.print(num + "" + ch + "  ");
            }
            System.out.println();
        }
    }
}
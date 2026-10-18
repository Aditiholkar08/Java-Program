
import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (count % 2 == 1) {
                    System.out.print((count * count * count) + "  ");
                } else {
                    System.out.print((count * count) + "  ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
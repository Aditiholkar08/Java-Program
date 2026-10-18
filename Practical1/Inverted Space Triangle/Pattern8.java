
import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int num = n * n;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (num % 2 == 0)
                    System.out.print(num * num + " ");
                else
                    System.out.print(num + " ");

                num--;
            }
            System.out.println();
        }
    }
}

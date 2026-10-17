
import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                int fact = 1;

                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }

                sum += fact;
                temp /= 10;
            }

            if (n > 0 && sum == n) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}

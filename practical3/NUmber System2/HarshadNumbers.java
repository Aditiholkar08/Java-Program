
import java.util.Scanner;

public class HarshadNumbers {
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
                sum += temp % 10;
                temp /= 10;
            }

            if (n > 0 && n % sum == 0) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}

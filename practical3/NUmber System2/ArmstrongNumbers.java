
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            int temp = n;
            int digits = 0;
            int sum = 0;

            int countTemp = n;

            while (countTemp > 0) {
                digits++;
                countTemp /= 10;
            }

            temp = n;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (n >= 0 && sum == n) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}


import java.util.Scanner;

public class DuckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            int temp = n;
            boolean duck = false;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == 0) {
                    duck = true;
                    break;
                }

                temp /= 10;
            }

            if (n > 0 && duck) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}

import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int num = 2;

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++)
                System.out.print("  ");

            int count = 2 * i - 1;
            int printed = 0;

            while (printed < count) {
                boolean prime = true;

                for (int k = 2; k * k <= num; k++) {
                    if (num % k == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    System.out.print(num + "  ");
                    printed++;
                }
                num++;
            }

            System.out.println();
        }
    }

}

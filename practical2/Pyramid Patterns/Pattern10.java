import java.util.Scanner;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (4 or 5): ");
        int n = sc.nextInt();

        int[] numbers = {
                1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 12, 18, 20, 21, 24, 27,
                30, 36, 40, 42, 45, 48, 50, 54, 60
        };

        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++)
                System.out.print("  ");

            int count = 2 * i - 1;

            for (int j = 1; j <= count; j++) {
                if (index < numbers.length) {
                    System.out.print(numbers[index] + "  ");
                    index++;
                }
            }

            System.out.println();
        }
    }

}


import java.util.Scanner;

class Pattern3Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int odd = 1, even = 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1 && j == 1) {
                    System.out.print(odd * odd + " ");
                    odd += 2;
                } else if (i % 2 == 0 && j == 1) {
                    System.out.print(even + " ");
                    even += 2;
                } else if (i % 2 == 1 && j % 2 == 0) {
                    System.out.print(odd * odd + " ");
                    odd += 2;
                } else {
                    System.out.print(even + " ");
                    even += 2;
                }
            }
            System.out.println();
        }
    }
}
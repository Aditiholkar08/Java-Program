
import java.util.Scanner;

class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int even = 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j && i % 2 == 0) {
                    System.out.print(even + " ");
                    even += 2;
                } else if (i == j && i % 2 != 0) {
                    System.out.print((i * i) + " ");
                } else if (j == 1 && i > 1) {
                    System.out.print(even + " ");
                    even += 2;
                } else {
                    System.out.print((i * i) + " ");
                }
            }
            System.out.println();
        }
    }
}
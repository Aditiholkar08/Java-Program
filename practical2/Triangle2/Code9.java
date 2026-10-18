
import java.util.Scanner;

class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int start = 1;

        for (int i = 1; i <= n; i++) {
            if (i >= 3) {
                start = start + i - 2;
            }

            for (int j = 0; j < i; j++) {
                System.out.print((start + j) + " ");
            }
            System.out.println();
        }
    }
}

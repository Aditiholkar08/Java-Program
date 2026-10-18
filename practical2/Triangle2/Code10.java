
import java.util.Scanner;

class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print(num + " ");
                } else {
                    char ch = (char) ('a' + num);
                    System.out.print(ch + " ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
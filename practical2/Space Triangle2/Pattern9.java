
import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print(i + "" + ch);
                } else if (i == 2) {
                    System.out.print(i + "" +
                            Character.toLowerCase(ch) + " ");
                } else {
                    System.out.print(i + "" + ch + " ");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
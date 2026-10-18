
import java.util.Scanner;

class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= rows - i + 1; j--) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
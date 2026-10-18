
import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (max 26): ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j < rows; j++) {
                System.out.print((char) ('A' + j) + "  ");
            }
            System.out.println();
        }
    }
}

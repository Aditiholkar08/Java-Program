
import java.util.Scanner;

class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (max 26): ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print((char) ('A' + j - 1) + "  ");
            }
            System.out.println();
        }
    }
}
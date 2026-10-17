import java.util.Scanner;

class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            int count = 2 * i - 1;

            for (int j = 1; j <= count; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
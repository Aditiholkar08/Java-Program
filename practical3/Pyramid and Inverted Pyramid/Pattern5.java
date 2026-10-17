import java.util.Scanner;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                char ch;

                if (i % 2 == 1) {
                    ch = (char) ('A' + j - 1);
                } else {
                    ch = (char) ('a' + j - 1);
                }

                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

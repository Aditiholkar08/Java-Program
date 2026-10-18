import java.util.Scanner;

class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num: ");
        int n = sc.nextInt();

        for (int i = 100; i < 100 + n; i++) {
            System.out.print(i + " ");
        }
    }
}

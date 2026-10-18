import java.util.Scanner;

class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num: ");
        int n = sc.nextInt();

        for (int i = n; i >= 10; i--) {
            System.out.print(i + " ");
        }
    }
}

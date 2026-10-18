
import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Sorry negative numbers are not allowed");
        } else {
            int result = num1 * num2;

            System.out.println("Multiplication = " + result);

            switch (result % 2) {
                case 0:
                    System.out.println("Even number");
                    break;

                case 1:
                    System.out.println("Odd number");
                    break;
            }
        }

        sc.close();
    }
}
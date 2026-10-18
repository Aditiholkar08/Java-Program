
import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operation (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case '%':
                if (num2 != 0) {
                    System.out.println(num1 % num2);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operation");
        }

        sc.close();
    }
}
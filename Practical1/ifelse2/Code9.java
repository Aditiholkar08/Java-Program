
import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        if (a * a + b * b == c * c) {
            System.out.println("It is a Pythagorean triplet");
        } else {
            System.out.println("It is not a Pythagorean triplet");
        }

        sc.close();
    }
}

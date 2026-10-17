
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;
        int divisor = 1;

        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        if (n >= 0 && square % divisor == n) {
            System.out.println(n + " is Automorphic");
        } else {
            System.out.println(n + " is not Automorphic");
        }

        sc.close();
    }
}

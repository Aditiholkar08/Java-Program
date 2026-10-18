
import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age > 0) {
            System.out.println("Valid age for voting");
        } else {
            System.out.println("Invalid age");
        }

        sc.close();
    }
}

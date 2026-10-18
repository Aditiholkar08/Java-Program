
import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double percent = sc.nextDouble();

        if (percent >= 75) {
            System.out.println("Passed : first class with distinction");
        } else if (percent >= 60) {
            System.out.println("Passed : first class");
        } else if (percent >= 50) {
            System.out.println("Passed : second class");
        } else if (percent >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}

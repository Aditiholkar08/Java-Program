
import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your available budget: ");
        int budget = sc.nextInt();

        System.out.print("Enter your food bill: ");
        int bill = sc.nextInt();

        if (budget > bill) {
            System.out.println("Bill paid successfully.");
            System.out.println("Remaining balance: " + (budget - bill));
        } else if (budget == bill) {
            System.out.println("Bill paid successfully.");
            System.out.println("No money remaining.");
        } else {
            System.out.println("Insufficient balance.");
            System.out.println("You need: " + (bill - budget) + " more rupees.");
        }

        sc.close();
    }
}

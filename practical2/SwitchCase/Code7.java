
import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Movie Subscription Plans -----");
        System.out.println("1. Platinum - Rs.799");
        System.out.println("2. Gold     - Rs.599");
        System.out.println("3. Silver   - Rs.399");
        System.out.println("4. Bronze   - Rs.199");
        System.out.println("5. Free     - Limited Access");

        System.out.print("Enter your plan: ");
        String plan = sc.nextLine().toLowerCase();

        switch (plan) {
            case "platinum":
                System.out.println("For the Platinum plan, the price is Rs.799");
                break;

            case "gold":
                System.out.println("For the Gold plan, the price is Rs.599");
                break;

            case "silver":
                System.out.println("For the Silver plan, the price is Rs.399");
                break;

            case "bronze":
                System.out.println("For the Bronze plan, the price is Rs.199");
                break;

            case "free":
                System.out.println("For less than Rs.199, the platform is free with limited access");
                break;

            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
}


import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("----- ATM MENU -----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Mini Statement");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is Rs." + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Amount deposited successfully");
                    System.out.println("Balance = Rs." + balance);
                } else {
                    System.out.println("Invalid amount");
                }
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();

                if (withdraw <= 0) {
                    System.out.println("Invalid amount");
                } else if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your cash");
                    System.out.println("Balance = Rs." + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;

            case 4:
                System.out.println("Mini Statement");
                System.out.println("Available balance = Rs." + balance);
                break;

            case 5:
                System.out.println("Thank you for using our ATM");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

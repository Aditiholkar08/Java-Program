import java.util.Scanner;

public class profitDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income:");
        float income = sc.nextInt();
        System.out.println("Enter Expense:");
        float expense = sc.nextInt();
        float diff = income - expense;
        System.out.println("Saving/loss=" + diff);
        if (diff < 0) {
            System.out.println("loss");

        } else if (diff > 0) {
            System.out.println("profit");
        }
    }

}

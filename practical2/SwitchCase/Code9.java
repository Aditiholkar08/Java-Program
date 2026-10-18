
import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        boolean failed = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks");
                sc.close();
                return;
            }

            if (marks < 35) {
                failed = true;
            }

            total = total + marks;
        }

        if (failed) {
            System.out.println("You failed the exam");
        } else {
            int percentage = total / 5;

            System.out.println("Total marks = " + total);
            System.out.println("Percentage = " + percentage + "%");

            switch (percentage / 5) {
                case 20:
                case 19:
                case 18:
                case 17:
                case 16:
                case 15:
                    System.out.println("First Class with Distinction");
                    break;

                case 14:
                case 13:
                case 12:
                    System.out.println("First Class");
                    break;

                case 11:
                case 10:
                    System.out.println("Second Class");
                    break;

                default:
                    System.out.println("Pass Class");
            }
        }

        sc.close();
    }
}

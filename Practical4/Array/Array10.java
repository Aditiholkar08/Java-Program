
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject "
                    + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        System.out.println("Student Marks:");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1)
                    + ": " + marks[i]);
        }

        System.out.println("Total marks: " + total);
        sc.close();
    }
}
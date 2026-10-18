import java.util.Scanner;

public class MarkDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pointer=");
        double pointer = sc.nextDouble();
        if (pointer >= 9.0 && pointer <= 10) {
            System.out.println("Pointer is O");

        } else if (pointer >= 8 && pointer < 9) {
            System.out.println("Pointer is A+");
        } else if (pointer >= 7 && pointer < 8) {
            System.out.println("Pointer is A");

        } else if (pointer >= 6 && pointer < 7) {
            System.out.println("Pointer is B+");
        } else if (pointer >= 5 && pointer < 6) {
            System.out.println("Pointer is B");

        } else {
            System.out.println("Fail");
        }
    }

}

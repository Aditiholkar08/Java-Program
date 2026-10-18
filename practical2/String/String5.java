
import java.util.Scanner;

class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() > 0) {
            System.out.println("First: " + str.charAt(0));
            System.out.println("Last: " + str.charAt(str.length() - 1));
        } else {
            System.out.println("String is empty");
        }
    }
}
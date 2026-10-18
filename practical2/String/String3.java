
import java.util.Scanner;

class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < str.length()) {
            System.out.println("Character: " + str.charAt(index));
        } else {
            System.out.println("Invalid index");
        }
    }
}
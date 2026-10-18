
import java.util.Scanner;

class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter str1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter str2: ");
        String str2 = sc.nextLine();

        int difference = str1.compareTo(str2);

        System.out.println("Difference = " + difference);
    }
}
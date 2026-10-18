
import java.util.Scanner;

class String12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter str1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter str2: ");
        String str2 = sc.nextLine();

        System.out.println(str1.equals(str2));
    }
}
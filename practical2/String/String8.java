
import java.util.Scanner;

class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(str.startsWith("Hello"));
    }
}
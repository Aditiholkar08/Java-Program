
import java.util.Scanner;

class String18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the substring to check:");
        String sub = sc.nextLine();

        if (sentence.toString().toLowerCase()
                .contains(sub.toString().toLowerCase())) {
            System.out.println("The sentence contains the substring \""
                    + sub.toLowerCase() + "\".");
        } else {
            System.out.println("The sentence does not contain the substring.");
        }
    }
}

import java.util.Scanner;

class String15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
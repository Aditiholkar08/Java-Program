
import java.util.Scanner;
import java.util.StringTokenizer;

class String17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter comma-separated words: ");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken().trim());
        }
    }
}
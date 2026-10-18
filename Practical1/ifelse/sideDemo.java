import java.util.Scanner;

public class sideDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side:");
        int s1 = sc.nextInt();
        System.out.println("Enter second side:");
        int s2 = sc.nextInt();
        System.out.println("Enter third side:");
        int s3 = sc.nextInt();

        if ((s1 * s1) + (s2 * s2) == (s3 * s3)) {
            System.out.println("It is Pythogoras");
        } else if ((s1 * s1) + (s3 * s3) == (s2 * s2)) {
            System.out.println("It is Pythogoras");
        } else if ((s3 * s3) + (s2 * s2) == (s1 * s1)) {
            System.out.println("It is Pythogoras");
        } else {
            System.out.println("It is not Pythogoras");
        }
    }

}

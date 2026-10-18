import java.util.Scanner;

public class countDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X=");
        int x = sc.nextInt();
        System.out.println("Enter start:");
        int start = sc.nextInt();
        System.out.println("Enter end:");
        int end = sc.nextInt();
        if (x >= start && x <= end) {
            System.out.println(start + " Number in range" + end);

        } else {
            System.out.println(start + " Number is not in range  " + end);
        }
    }

}

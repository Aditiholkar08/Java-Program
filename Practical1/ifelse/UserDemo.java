import java.util.Scanner;

class UserDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        System.out.println("enter x:");
        int x = sc.nextInt();
        if (num % x == 0) {
            System.out.println(num + " is divide by " + x);
        } else {
            System.out.println(num + " is not divide by " + x);
        }

    }
}
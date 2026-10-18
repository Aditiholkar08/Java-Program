import java.util.Scanner;

public class voteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println(age + " eligble for voting");
        } else {
            System.out.println(age + " not eligble for voting");
        }
    }

}

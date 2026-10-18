import java.util.*;

public class flat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Socity Name:");
        String SocName = sc.next();

        System.out.println("Enter Wing:");
        char wing = sc.next().charAt(0);

        System.out.println("Enter FlatNo:");
        int FlatNO = sc.nextInt();

        System.out.println("Enter Rent:");
        float rent = sc.nextFloat();

        System.out.println(SocName);
        System.out.println(wing);
        System.out.println(FlatNO);
        System.out.println(rent);
    }

}
import java.util.Scanner;

public class dressSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dress size=");
        String size = sc.nextLine();
        switch (size) {
            case "XS":
                System.out.println("Extra Small");
                break;
            case "S":
                System.out.println(" Small");
                break;
            case "M":
                System.out.println("Medium");
                break;
            case "L":
                System.out.println("Large");
                break;
            case "XL":
                System.out.println("Extra Large");
                break;

            default:
                System.out.println("Invalid Size");
                break;
        }
    }

}


public class Code4 {
    public static void main(String[] args) {
        double percentage = 82.50;

        if (percentage > 85.00) {
            System.out.println("Medical");
        } else if (percentage <= 85.00 && percentage > 75.00) {
            System.out.println("Engineering");
        } else if (percentage <= 75.00 && percentage >= 65.00) {
            System.out.println("Pharmacy or Bachelor in Science");
        } else {
            System.out.println("Other career options");
        }
    }
}

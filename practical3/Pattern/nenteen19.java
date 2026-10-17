public class nenteen19 {
    public static void main(String[] args) {
        int row = 4;
        for (int i = 1; i <= row; i++) {
            for (int sp = 1; sp <= i - 1; sp++) {
                System.out.println("");
            }
            for (int j = 1; j <= row + 1 - i; j++) {
                System.out.print("* \t");
            }
            System.out.print("");
        }
    }
}

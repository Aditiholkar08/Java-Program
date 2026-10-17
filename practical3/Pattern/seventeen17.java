public class seventeen17 {
    public static void main(String[] args) {
        int row = 4;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j <= row - i) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.print("\t");
            // for (int sp = 1; sp <= row - i; sp++) {
            // System.out.println("*\t");
            for (int j = 1; j <= i; j++) {
                System.out.print("* \t");
            }
            System.out.println();
        }
    }

}

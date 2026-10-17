public class sixteen16 {
    public static void main(String[] args) {
        int row = 6;
        int num = row * (row + 1) / 2;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

}

public class ten10 {
    public static void main(String[] args) {
        int num = 1;
        int row = 3;
        for (int i = 1; i <= row; i++) {
            num = num * i;
            for (int j = 1; j <= row; j++) {
                System.out.print(num + "  ");
                num++;

            }
            System.out.println();
        }
    }

}

public class eleven11 {
    public static void main(String[] args) {
        int row = 3;
        int num = row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) 64 + num + "   ");
                } else {
                    System.out.print(i + "  ");
                }
            }
            num--;
            System.out.println();
        }
    }

}

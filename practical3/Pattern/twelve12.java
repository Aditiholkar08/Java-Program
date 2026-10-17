public class twelve12 {
    public static void main(String[] args) {
        int row = 3;
        for (int i = 1; i <= row; i++) {
            char ch;
            if (i % 2 == 1) {
                System.out.print((ch = (char) 64 + row));
            } else {
                System.out.print(ch = 'A');
            }
            for (int j = 1; j <= row; j++) {
                if (i % 2 == 1) {
                    System.out.print(ch + "  ");
                    ch--;
                } else {
                    System.out.print(ch + "1");
                    ch++;
                }
                System.out.println();
            }
        }
    }

}

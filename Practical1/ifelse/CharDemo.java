public class CharDemo {
    public static void main(String[] args) {
        char ch = 'D';
        if (ch >= 'a' && ch >= 65) {
            System.out.println(ch + " is lower case");
        } else if (ch <= 90 && ch >= 65) {
            System.out.println(ch + " is upper case");
        } else {
            System.out.println("Invalid Alphabet");
        }
    }

}

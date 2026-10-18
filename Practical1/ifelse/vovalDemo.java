public class vovalDemo {
    public static void main(String[] args) {
        char ch = '|';
        if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'u' || ch == 'o' || ch == 'A' || ch == 'I' || ch == 'E'
                || ch == 'U' || ch == 'O') {
            System.out.println(ch + " is vowel");

        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is consonant");
        } else {
            System.out.println("Invalid Character");
        }
    }
}

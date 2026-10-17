
class Array1 {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50,
                60, 70, 80, 90, 100 };

        System.out.println("Array elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
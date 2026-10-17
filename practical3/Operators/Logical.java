class Logical {
    public static void main(String[] args) {
        boolean value1 = false;
        boolean value2 = true;

        System.out.println("Logical AND:" + (value1 && value2));
        System.out.println("Logical OR:" + (value1 || value2));
        System.out.println("Logical 1st NOT:" + (value1 != value2));
        System.out.println("Logical  2nd not:" + (value1 = !value2));
    }
}
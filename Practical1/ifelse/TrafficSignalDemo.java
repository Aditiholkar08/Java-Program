public class TrafficSignalDemo {
    public static void main(String[] args) {
        String signal = "Red";
        if (signal == "Red") {
            System.out.println("Stop");

        } else if (signal == "Yellow") {
            System.out.println("Wait");
        } else if (signal == "Green") {
            System.out.println("Go");

        } else {
            System.out.println("Invalid signal");
        }

    }

}

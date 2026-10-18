
class Transport {
    String mode;
    int maxSpeed;

    Transport(String mode, int maxSpeed) {
        this.mode = mode;
        this.maxSpeed = maxSpeed;
    }
}

class Bus extends Transport {
    int routeNo;
    int seatCount;

    Bus(String mode, int maxSpeed, int routeNo, int seatCount) {
        super(mode, maxSpeed);
        this.routeNo = routeNo;
        this.seatCount = seatCount;
    }

    void showRouteDetails() {
        System.out.println("Mode: " + mode);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
        System.out.println("Route Number: " + routeNo);
        System.out.println("Seat Count: " + seatCount);
    }

    public static void main(String[] args) {
        Bus b = new Bus("Road", 80, 101, 50);
        b.showRouteDetails();
    }
}
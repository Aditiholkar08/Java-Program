
class FlightTicket {
    int ticketNo;
    String passengerName;
    String seatClass;

    FlightTicket(int ticketNo, String passengerName, String seatClass) {
        this.ticketNo = ticketNo;
        this.passengerName = passengerName;
        this.seatClass = seatClass;
    }

    void calculateCharges() {
        double charges;

        if (seatClass.equalsIgnoreCase("Business")) {
            charges = 5000;
        } else if (seatClass.equalsIgnoreCase("First")) {
            charges = 10000;
        } else {
            charges = 1000;
        }

        System.out.println("Ticket No: " + ticketNo);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Additional Charges: " + charges);
    }

    public static void main(String[] args) {
        FlightTicket f = new FlightTicket(201, "Aditi", "Business");
        f.calculateCharges();
    }
}
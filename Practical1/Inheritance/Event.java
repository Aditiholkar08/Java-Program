
class Event {
    String eventName;
    String location;

    Event(String eventName, String location) {
        this.eventName = eventName;
        this.location = location;
    }
}

class SportsEvent extends Event {
    String sportType;

    SportsEvent(String eventName, String location, String sportType) {
        super(eventName, location);
        this.sportType = sportType;
    }

    void displayInfo() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Sport Type: " + sportType);
    }

    public static void main(String[] args) {
        SportsEvent s = new SportsEvent("Annual Sports", "Pune", "Cricket");
        s.displayInfo();
    }
}
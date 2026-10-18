
class Artist {
    String name;
    int age;

    Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Musician extends Artist {
    String instrument;

    Musician(String name, int age, String instrument) {
        super(name, age);
        this.instrument = instrument;
    }

    void perform() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Instrument: " + instrument);
        System.out.println(name + " is performing on " + instrument);
    }

    public static void main(String[] args) {
        Musician m = new Musician("Rahul", 25, "Guitar");
        m.perform();
    }
}
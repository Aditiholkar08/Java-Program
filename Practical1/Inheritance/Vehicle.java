
class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    double price;
    String fuelType;

    Car(String brand, String model, double price, String fuelType) {
        super(brand, model);
        this.price = price;
        this.fuelType = fuelType;
    }

    void displayCar() {
        displayVehicle();
        System.out.println("Price: " + price);
        System.out.println("Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {
        Car c = new Car("Tata", "Nexon", 900000, "Petrol");
        c.displayCar();
    }
}
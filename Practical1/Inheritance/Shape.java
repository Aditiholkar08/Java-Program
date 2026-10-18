
class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        double area = length * breadth;

        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("Blue", 10, 5);
        r.calculateArea();
    }
}
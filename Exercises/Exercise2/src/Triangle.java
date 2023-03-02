public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    public static String type = "Triangle";

    public Triangle() {
    }

    public Triangle(String color, double sideA, double sideB, double sideC) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String toString() {
        String color = this.color;
        return "I'm a " + color + " " + type + " , my area is " + this.calculateArea() + " and my perimeter is " + this.calculatePerimeter();
    }

    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2.0;
        double a = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        return a;
    }

    public double calculatePerimeter() {
        double p = sideA + sideB + sideC;
        return p;
    }
}
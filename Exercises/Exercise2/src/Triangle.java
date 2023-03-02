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
        String var10000 = this.color;
        return "I'm a " + var10000 + " " + type + " , my area is " + this.calculateArea() + " and my perimeter is " + this.calculatePerimeter();
    }

    public double calculateArea() {
        double s = (this.sideA + this.sideB + this.sideC) / 2.0;
        double a = Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
        return a;
    }

    public double calculatePerimeter() {
        double p = this.sideA + this.sideB + this.sideC;
        return p;
    }
}
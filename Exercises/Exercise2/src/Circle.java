public class Circle extends Shape {
    private double radius;
    public static String type = "Circle";

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String color = this.color;
        return "I'm a " + color + " " + type + " , my area is " + this.calculateArea() + " and my perimeter is " + this.calculatePerimeter();
    }

    public double calculateArea() {
        double a = Math.PI * radius * radius;
        return a;
    }

    public double calculatePerimeter() {
        double p = Math.PI * radius * 2;
        return p;
    }
}
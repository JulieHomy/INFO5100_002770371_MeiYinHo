public class Square extends Shape {
    private double side;
    public static String type = "Square";

    public Square() {
    }

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    public String toString() {
        String color = this.color;
        return "I'm a " + color + " " + type + " , my area is " + this.calculateArea() + " and my perimeter is " + this.calculatePerimeter();
    }

    public double calculateArea() {
        double s = side * side;
        return s;
    }

    public double calculatePerimeter() {
        double p = side * 4.0;
        return p;
    }
}
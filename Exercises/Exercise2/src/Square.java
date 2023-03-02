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
        String var10000 = this.color;
        return "I'm a " + var10000 + " " + type + " , my area is " + this.calculateArea() + " and my perimeter is " + this.calculatePerimeter();
    }

    public double calculateArea() {
        double s = this.side * this.side;
        return s;
    }

    public double calculatePerimeter() {
        double p = this.side * 4.0;
        return p;
    }
}
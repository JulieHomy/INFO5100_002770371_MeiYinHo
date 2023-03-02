public class Rectangle extends Shape {
    private double length;
    private double width;
    public static String type = "Rectangle";

    public Rectangle() {
    }

    public Rectangle(String color, double length, double width) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String toString() {
        String var10000 = this.color;
        return "I am a " + var10000 + " " + type + " , my area is " + this.calculateArea() + " and my perimeter is " + this.calculatePerimeter();
    }

    public double calculateArea() {
        double s = this.length * this.width;
        return s;
    }

    public double calculatePerimeter() {
        double p = (this.length + this.width) * 2.0;
        return p;
    }
}
public abstract class Shape {
    public static String type = "Unkown Shape";
    public String color;

    public Shape() {
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String toString() {
        return "I'm a " + type;
    }
}

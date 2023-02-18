public class Pencil {
    private String color;
    private double length;
    private double width;
    private String material;
    private String brand;
    private int numPagesWritten;
    private boolean isMechanical;
    private double price;

    public Pencil(String color, double length, double width, String material, String brand, int numPagesWritten, boolean isMechanical, double price) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.material = material;
        this.brand = brand;
        this.numPagesWritten = numPagesWritten;
        this.isMechanical = isMechanical;
        this.price = price;
        System.out.println("A new pencil of brand name " + brand + " has been created!");
    }

    public void write(String text) {
        System.out.println("Writing '" + text + "' with " + brand + " pencil.");
        numPagesWritten++;
    }

    public void sharpen() {
        System.out.println("Sharpening " + brand + " pencil.");
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Pencil pencil1 = new Pencil("Yellow", 7.5, 0.3, "Wood", "Dixon Ticonderoga", 10, false, 0.99);
        Pencil pencil2 = new Pencil("Red", 6.5, 0.4, "Plastic", "Paper Mate Clearpoint", 5, true, 1.99);
        Pencil pencil3 = new Pencil("Blue", 7.0, 0.35, "Metal", "Rotring 600", 15, false, 9.99);

        pencil1.write("Hello, world!");
        pencil2.sharpen();
        System.out.println("Pencil 3 price: $" + pencil3.getPrice());

    }
}

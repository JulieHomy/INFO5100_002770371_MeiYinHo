public class Mug {
    private String material;
    private double height;
    private double width;
    private int capacity;
    private String color;
    private boolean hasHandle;
    private String design;
    private double price;

    public Mug(String material, double height, double width, int capacity, String color, boolean hasHandle, String design, double price) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.capacity = capacity;
        this.color = color;
        this.hasHandle = hasHandle;
        this.design = design;
        this.price = price;

        System.out.println(design + " mug has been created!");
    }

    public void fillWithLiquid() {
        System.out.println(design + " mug has been filled with liquid.");
    }

    public void emptyMug() {
        System.out.println(color + "mug has been emptied.");
    }

    public double getPrice() {
        return price;
    }


    public static void main(String[] args) {
        Mug mug1 = new Mug("Ceramic", 4.5, 3.5, 12, "White", true, "Polka Dots", 5.99);
        Mug mug2 = new Mug("Glass", 5.0, 3.0, 10, "Clear", false, "Stripes", 7.99);
        Mug mug3 = new Mug("Stainless Steel", 4.0, 4.0, 16, "Silver", true, "Plain", 9.99);

        mug1.fillWithLiquid();
        mug2.emptyMug();
        System.out.println("Mug 3 price: $" + mug3.getPrice());
    }
}


public class Hanger {
    private int size;
    private String color;
    private String material;
    private int maxCapacity;
    private boolean isFoldable;
    private boolean isPadded;
    private String brand;
    private int numHooks;

    public Hanger(int size, String color, String material, int maxCapacity, boolean isFoldable, boolean isPadded, String brand, int numHooks) {
        this.size = size;
        this.color = color;
        this.material = material;
        this.maxCapacity = maxCapacity;
        this.isFoldable = isFoldable;
        this.isPadded = isPadded;
        this.brand = brand;
        this.numHooks = numHooks;
        System.out.println("Hanger created with brand name: " + brand);
    }

    public void hangClothes() {
        System.out.println("Hanging clothes on " + brand + " hanger.");
    }

    public void removeClothes() {
        System.out.println("Removing clothes from " + brand + " hanger.");
    }

    public void adjustSize() {
        System.out.println("Adjusting size of " + brand + " hanger.");
    }

    public static void main(String[] args) {
        Hanger hanger1 = new Hanger(20, "Black", "Plastic", 10, false, false, "Generic", 1);
        Hanger hanger2 = new Hanger(25, "White", "Wooden", 8, true, false, "IKEA", 2);
        Hanger hanger3 = new Hanger(18, "Pink", "Metal", 12, false, true, "Honey-Can-Do", 1);

        hanger1.hangClothes();
        hanger2.removeClothes();
        hanger3.adjustSize();
    }
}


public class Lotion {
    private String brand;
    private String type;
    private String scent;
    private double price;
    private int volume;
    private String packaging;
    private boolean isHypoallergenic;
    private boolean isCrueltyFree;

    public Lotion(String brand, String type, String scent, double price, int volume, String packaging,
                  boolean isHypoallergenic, boolean isCrueltyFree) {
        this.brand = brand;
        this.type = type;
        this.scent = scent;
        this.price = price;
        this.volume = volume;
        this.packaging = packaging;
        this.isHypoallergenic = isHypoallergenic;
        this.isCrueltyFree = isCrueltyFree;
        System.out.println("Created a new " + brand + " Lotion");
    }


    public void apply() {
        System.out.println("Applying lotion to skin");
    }

    public void discard() {
        System.out.println("Discarding empty lotion bottle");
    }

    public void shake() {
        System.out.println("Shaking lotion bottle before use");
    }

    public static void main(String[] args) {
        Lotion lotion1 = new Lotion("Dove", "Body Lotion", "Shea Butter", 8.99, 500, "Bottle",
                true, true);
        Lotion lotion2 = new Lotion("Nivea", "Face Lotion", "Fragrance-free", 12.99, 250, "Tube",
                false, true);
        Lotion lotion3 = new Lotion("Aveeno", "Body Lotion", "Lavender", 14.99, 750, "Pump Bottle",
                true, true);

        lotion1.apply();
        lotion2.discard();
        lotion3.shake();
    }
}


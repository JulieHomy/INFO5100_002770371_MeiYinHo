public class Comb {
    private String color;
    private int length;
    private int numTeeth;
    private boolean hasHandle;
    private String material;
    private boolean isWideTooth;
    private double price;
    private String brand;

    public Comb(String color, int length, int numTeeth, boolean hasHandle, String material, boolean isWideTooth, double price, String brand) {
        this.color = color;
        this.length = length;
        this.numTeeth = numTeeth;
        this.hasHandle = hasHandle;
        this.material = material;
        this.isWideTooth = isWideTooth;
        this.price = price;
        this.brand = brand;
        System.out.println("A new comb of brand name " + brand + " has been created!");
    }

    public void combHair() {
        System.out.println("Combing hair with " + brand + " comb.");
    }

    public void clean() {
        System.out.println("Cleaning " + brand + " comb.");
    }

    public boolean isWideTooth() {
        return isWideTooth;
    }


    public static void main(String[] args) {
        Comb comb1 = new Comb("Black", 6, 20, true, "Plastic", true, 3.99, "Conair");
        Comb comb2 = new Comb("Pink", 4, 10, false, "Metal", false, 5.99, "Mason Pearson");
        Comb comb3 = new Comb("Blue", 5, 15, true, "Plastic", true, 2.99, "Goody");

        comb1.combHair();
        comb2.clean();
        System.out.println("Comb 3 is wide-tooth: " + comb3.isWideTooth());
    }
}

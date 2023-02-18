public class Glasses {
    private String brand;
    private String model;
    private double lensSize;
    private double frameSize;
    private String frameMaterial;
    private String lensMaterial;
    private String color;
    private double price;

    public Glasses(String brand, String model, double lensSize, double frameSize, String frameMaterial, String lensMaterial, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.lensSize = lensSize;
        this.frameSize = frameSize;
        this.frameMaterial = frameMaterial;
        this.lensMaterial = lensMaterial;
        this.color = color;
        this.price = price;
        System.out.println("Glasses of brand name " + brand + " has been created!");
    }

    public void putOn() {
        System.out.println("Glasses " + model + " have been put on.");
    }

    public void takeOff() {
        System.out.println("Glasses " + model + " have been taken off.");
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Glasses glasses1 = new Glasses("Ray-Ban", "Aviator", 58.0, 135.0, "Metal", "Glass", "Gold", 149.99);
        Glasses glasses2 = new Glasses("Oakley", "Holbrook", 55.0, 137.0, "O Matter", "Plutonite", "Black", 129.99);
        Glasses glasses3 = new Glasses("Gucci", "GG0403O", 53.0, 145.0, "Acetate", "Plastic", "Havana", 329.99);

        glasses1.putOn();
        glasses2.takeOff();
        System.out.println("Glasses 3 price: $" + glasses3.getPrice());
    }
}


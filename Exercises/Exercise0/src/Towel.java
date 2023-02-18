public class Towel {
    private String brand;
    private String color;
    private int length;
    private int width;
    private boolean isAbsorbent;
    private boolean isQuickDrying;
    private boolean isMachineWashable;
    private int price;

    public Towel(String brand, String color, int length, int width, boolean isAbsorbent, boolean isQuickDrying, boolean isMachineWashable, int price) {
        this.brand = brand;
        this.color = color;
        this.length = length;
        this.width = width;
        this.isAbsorbent = isAbsorbent;
        this.isQuickDrying = isQuickDrying;
        this.isMachineWashable = isMachineWashable;
        this.price = price;
        System.out.println("New towel created with brand name " + brand);
    }

    public void dryOff() {
        System.out.println("Drying off with towel " + brand);
    }

    public void fold() {
        System.out.println("Folding towel " + brand);
    }

    public void wash() {
        System.out.println("Washing towel " + brand);
    }

    public static void main(String[] args) {
        Towel towel1 = new Towel("Cannon", "Blue", 60, 30, true, true, true, 20);
        Towel towel2 = new Towel("Fieldcrest", "White", 70, 40, true, true, true, 25);
        Towel towel3 = new Towel("Target", "Pink", 50, 25, true, true, true, 15);

        towel1.dryOff();
        towel2.fold();
        towel3.wash();
    }
}


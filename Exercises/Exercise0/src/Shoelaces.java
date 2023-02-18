public class Shoelaces {
    private String material;
    private String color;
    private int length;
    private int width;
    private String name;
    private boolean hasAglets;
    private boolean isWaterproof;
    private boolean isReflective;

    public Shoelaces(String material, String color, int length, int width, String name, boolean hasAglets, boolean isWaterproof, boolean isReflective) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.name = name;
        this.hasAglets = hasAglets;
        this.isWaterproof = isWaterproof;
        this.isReflective = isReflective;
        System.out.println("New shoelace instance with name " + name + " has been created.");
    }

    public void tie() {
        System.out.println("Shoelace is tied.");
    }

    public void untie() {
        System.out.println("Shoelace is untied.");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Shoelaces lace1 = new Shoelaces("Nylon", "Red", 36, 1, "Nike", true, false, false);
        Shoelaces lace2 = new Shoelaces("Cotton", "Black", 45, 2, "Adidas", true, true, false);
        Shoelaces lace3 = new Shoelaces("Polyester", "Green", 42, 2, "New Balance", false, false, true);

        lace1.tie();
        lace2.untie();
        lace3.getName();
    }
}


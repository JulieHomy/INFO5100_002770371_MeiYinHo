public class Screen {
    private String brand;
    private double size;
    private int resolutionWidth;
    private int resolutionHeight;
    private String displayTechnology;
    private boolean isTouchscreen;
    private int brightness;
    private int price;

    public Screen(String brand, double size, int resolutionWidth, int resolutionHeight, String displayTechnology, boolean isTouchscreen, int brightness, int price) {
        this.brand = brand;
        this.size = size;
        this.resolutionWidth = resolutionWidth;
        this.resolutionHeight = resolutionHeight;
        this.displayTechnology = displayTechnology;
        this.isTouchscreen = isTouchscreen;
        this.brightness = brightness;
        this.price = price;
        System.out.println("New screen created with brand name " + brand);
    }

    public void turnOn() {
        System.out.println("Turning on screen " + brand);
    }

    public void adjustBrightness() {
        System.out.println("Adjusting brightness on screen " + brand);
    }

    public void touch() {
        if (isTouchscreen) {
            System.out.println("Touching screen " + brand);
        } else {
            System.out.println("Screen " + brand + " is not a touchscreen");
        }
    }

    public static void main(String[] args) {
        Screen screen1 = new Screen("Samsung", 27, 1920, 1080, "LED", false, 300, 200);
        Screen screen2 = new Screen("Dell", 24, 1920, 1200, "IPS", true, 350, 300);
        Screen screen3 = new Screen("LG", 32, 3840, 2160, "OLED", true, 400, 500);

        screen1.turnOn();
        screen2.adjustBrightness();
        screen3.touch();
    }
}


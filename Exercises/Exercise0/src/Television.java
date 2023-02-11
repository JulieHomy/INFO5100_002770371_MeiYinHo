public class Television {
    private int id;
    private String brand;
    private int size;
    private String resolution;
    private int refreshRate;
    private boolean isSmart;
    private int numHDMIPorts;
    private int numUSBPorts;

    public Television(int id, String brand, int size, String resolution, int refreshRate, boolean isSmart, int numHDMIPorts, int numUSBPorts) {
        this.id = id;
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.isSmart = isSmart;
        this.numHDMIPorts = numHDMIPorts;
        this.numUSBPorts = numUSBPorts;
        System.out.println("Television instance created, id: " + id);
    }

    public void turnOn() {
        System.out.println("Television is turning on");
    }

    public void turnOff() {
        System.out.println("Television is turning off");
    }

    public void changeChannel() {
        System.out.println("Television is changing channel");
    }
}


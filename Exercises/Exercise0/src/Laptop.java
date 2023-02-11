public class Laptop {
        private int id;
        private String brand;
        private String model;
        private int yearReleased;
        private String operatingSystem;
        private int storageSize;
        private int RAM;
        private int batteryLife;

        public Laptop(int id, String brand, String model, int yearReleased, String operatingSystem, int storageSize, int RAM, int batteryLife) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.yearReleased = yearReleased;
            this.operatingSystem = operatingSystem;
            this.storageSize = storageSize;
            this.RAM = RAM;
            this.batteryLife = batteryLife;
            System.out.println("Laptop instance created, id: " + id);
        }

        public void turnOn() {
            System.out.println("Laptop is turning on");
        }

        public void turnOff() {
            System.out.println("Laptop is turning off");
        }

        public void restart() {
            System.out.println("Laptop is restarting");
        }
    }

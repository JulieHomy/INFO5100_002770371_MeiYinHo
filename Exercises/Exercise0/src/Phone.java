public class Phone {
        private int id;
        private String brand;
        private String model;
        private int yearReleased;
        private String operatingSystem;
        private int storageSize;
        private int RAM;
        private int batteryLife;

        public Phone(int id, String brand, String model, int yearReleased, String operatingSystem, int storageSize, int RAM, int batteryLife) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.yearReleased = yearReleased;
            this.operatingSystem = operatingSystem;
            this.storageSize = storageSize;
            this.RAM = RAM;
            this.batteryLife = batteryLife;
            System.out.println("Phone instance created, id: " + id);
        }

        public void makeCall() {
            System.out.println("Phone is making a call");
        }

        public void sendText() {
            System.out.println("Phone is sending a text");
        }

        public void browseInternet() {
            System.out.println("Phone is browsing the internet");
        }
    }

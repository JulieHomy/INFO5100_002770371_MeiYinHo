public class Camera {
        private int id;
        private String brand;
        private String model;
        private int yearReleased;
        private String lensType;
        private int megapixels;
        private boolean hasWiFi;
        private boolean hasGPS;

        public Camera(int id, String brand, String model, int yearReleased, String lensType, int megapixels, boolean hasWiFi, boolean hasGPS) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.yearReleased = yearReleased;
            this.lensType = lensType;
            this.megapixels = megapixels;
            this.hasWiFi = hasWiFi;
            this.hasGPS = hasGPS;
            System.out.println("Camera instance created, id: " + id);
        }

        public void takePhoto() {
            System.out.println("Camera is taking a photo");
        }

        public void recordVideo() {
            System.out.println("Camera is recording a video");
        }

        public void uploadPhoto() {
            System.out.println("Camera is uploading a photo");
        }
}

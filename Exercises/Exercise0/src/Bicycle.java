public class Bicycle {
        private int id;
        private String make;
        private String model;
        private int year;
        private String color;
        private int numGears;
        private int wheelSize;
        private boolean hasKickstand;

        public Bicycle(int id, String make, String model, int year, String color, int numGears, int wheelSize, boolean hasKickstand) {
            this.id = id;
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
            this.numGears = numGears;
            this.wheelSize = wheelSize;
            this.hasKickstand = hasKickstand;
            System.out.println("Bicycle instance created, id: " + id);
        }

        public void pedal() {
            System.out.println("Bicycle is pedaling");
        }

        public void brake() {
            System.out.println("Bicycle is braking");
        }

        public void shiftGear() {
            System.out.println("Bicycle is shifting gear");
        }
    }


public class Car {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private int numDoors;
    private int numSeats;
    private int topSpeed;

    public Car(int id, String make, String model, int year, String color, int numDoors, int numSeats, int topSpeed) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.numDoors = numDoors;
        this.numSeats = numSeats;
        this.topSpeed = topSpeed;
        System.out.println("Car instance created, id: " + id);
    }

    public void drive() {
        System.out.println("Car is driving");
    }

    public void stop() {
        System.out.println("Car has stopped");
    }

    public void honk() {
        System.out.println("Car is honking");
    }

    class Engine {
        private int id;
        private int horsepower;
        private int torque;

        public Engine(int id, int horsepower, int torque) {
            this.id = id;
            this.horsepower = horsepower;
            this.torque = torque;
            System.out.println("Engine instance created, id: " + id);
        }

        public void start() {
            System.out.println("Engine is starting");
        }

        public void stop() {
            System.out.println("Engine has stopped");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Car car1 = new Car(1, "Toyota", "Camry", 2022, "Red", 4, 5, 150);
//        Car car2 = new Car(2, "Honda", "Civic", 2021, "Blue", 4, 5, 140);
//        Car car3 = new Car(3, "Tesla", "Model S", 2022, "Black", 4, 5, 200);
//    }
//}

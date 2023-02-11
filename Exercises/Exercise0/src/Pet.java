public class Pet {
        private int id;
        private String name;
        private String breed;
        private int age;
        private char gender;
        private boolean isVaccinated;
        private String ownerName;
        private String address;

        public Pet(int id, String name, String breed, int age, char gender, boolean isVaccinated, String ownerName, String address) {
            this.id = id;
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.gender = gender;
            this.isVaccinated = isVaccinated;
            this.ownerName = ownerName;
            this.address = address;
            System.out.println("Pet instance created with ID: " + this.id);
        }

        public void play() {
            System.out.println("Pet with ID: " + this.id + " is playing");
        }

        public void eat() {
            System.out.println("Pet with ID: " + this.id + " is eating");
        }

        public void sleep() {
            System.out.println("Pet with ID: " + this.id + " is sleeping");
        }
    }

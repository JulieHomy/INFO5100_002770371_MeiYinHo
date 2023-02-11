public class Person {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String address;
        private String phoneNumber;
        private String email;

        public Person(int id, String firstName, String lastName, int age, String gender, String address, String phoneNumber, String email) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
            System.out.println("A person with id " + id + " has been created");
        }

        public void sayHello() {
            System.out.println("Person id " + id + " says hello");
        }

        public void introduce() {
            System.out.println("Person id " + id + " is introducing themselves");
        }

        public void sayGoodbye() {
            System.out.println("Person id " + id + " says goodbye");
        }
    }


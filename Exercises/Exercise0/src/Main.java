public class Main {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle(1, "Schwinn", "Roadster", 2020, "Green", 18, 26, true);
        Bicycle bicycle2 = new Bicycle(2, "Trek", "Mountain Bike", 2021, "Red", 21, 29, true);
        Bicycle bicycle3 = new Bicycle(3, "Giant", "City Bike", 2022, "Blue", 7, 26, false);

        Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee", 324, "J. B. Lippincott & Co.", 1960, "Fiction", "9780446310789");
        Book book2 = new Book(2, "The Great Gatsby", "F. Scott Fitzgerald", 180, "Charles Scribner's Sons", 1925, "Fiction", "9781476766800");
        Book book3 = new Book(3, "Pride and Prejudice", "Jane Austen", 279, "Thomas Egerton", 1813, "Fiction", "9780141439518");

        Camera camera1 = new Camera(1, "Canon", "EOS R", 2022, "EF", 30, true, true);
        Camera camera2 = new Camera(2, "Nikon", "Z7", 2021, "Z", 45, true, false);
        Camera camera3 = new Camera(3, "Sony", "A7R IV", 2022, "E", 61, false, true);

        Car car1 = new Car(1, "Toyota", "Camry", 2022, "Red", 4, 5, 150);
        Car car2 = new Car(2, "Honda", "Civic", 2021, "Blue", 4, 5, 140);
        Car car3 = new Car(3, "Tesla", "Model S", 2022, "Black", 4, 5, 200);

        Laptop laptop1 = new Laptop(1, "Dell", "Inspiron", 2022, "Windows 10", 256, 8, 10);
        Laptop laptop2 = new Laptop(2, "Apple", "MacBook Pro", 2021, "macOS", 512, 16, 12);
        Laptop laptop3 = new Laptop(3, "HP", "Pavilion", 2022, "Windows 10", 128, 8, 8);

        Library library = new Library(1, "Main Library", "123 Main Street", "555-555-1234", 1000, 500, "mainlibrary@example.com", "www.mainlibrary.com");
        Library branchLibrary = new Library(2, "Branch Library", "456 Oak Avenue", "555-555-5678", 500, 200, "branchlibrary@example.com", "www.branchlibrary.com");
        Library communityLibrary = new Library(3, "Community Library", "789 Maple Boulevard", "555-555-9012", 200, 100, "communitylibrary@example.com", "www.communitylibrary.com");

        Person person1 = new Person(1, "John", "Doe", 30, "Male", "123 Main St", "555-555-1212", "john.doe@email.com");
        Person person2 = new Person(2, "Jane", "Doe", 28, "Female", "456 Elm St", "555-555-1213", "jane.doe@email.com");
        Person person3 = new Person(3, "Bob", "Smith", 32, "Male", "789 Oak St", "555-555-1214", "bob.smith@email.com");

        Pet pet1 = new Pet(1, "Max", "Labrador", 2, 'M', true, "John", "123 Main St");
        Pet pet2 = new Pet(2, "Daisy", "Poodle", 3, 'F', true, "Jane", "456 Oak Ave");
        Pet pet3 = new Pet(3, "Buddy", "German Shepherd", 4, 'M', false, "Jim", "789 Pine St");

        Phone phone = new Phone(1, "Apple", "iPhone 11 Pro Max", 2019, "iOS 13", 512, 4, 3500);
        Phone samsung = new Phone(2, "Samsung", "Galaxy S21 Ultra", 2021, "Android 11", 128, 12, 5000);
        Phone google = new Phone(3, "Google", "Pixel 6 Pro", 2022, "Android 12", 256, 8, 4000);

        Television tv1 = new Television(1, "Samsung", 55, "4K ultra HD", 2022, true, 4, 2);
        Television tv2 = new Television(2, "LG", 65, "4K ultra HD", 2021, true, 3, 2);
        Television tv3 = new Television(3, "Vizio", 70, "4K ultra HD", 2000, true, 3, 1);
    }
}


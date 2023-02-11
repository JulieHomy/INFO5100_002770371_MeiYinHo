public class Library {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private int booksCount;
    private int membersCount;
    private String email;
    private String website;

    public Library(int id, String name, String address, String phoneNumber, int booksCount, int membersCount, String email, String website) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.booksCount = booksCount;
        this.membersCount = membersCount;
        this.email = email;
        this.website = website;
        System.out.println("Library created with id: " + id);
    }


    public void displayLibraryInformation() {
        System.out.println("Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber + ", Books Count: " + booksCount + ", Members Count: " + membersCount + ", Email: " + email);
    }
}


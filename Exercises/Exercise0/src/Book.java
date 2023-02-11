public class Book {
        private int id;
        private String title;
        private String author;
        private int pages;
        private String publisher;
        private int publicationYear;
        private String genre;
        private String ISBN;

        public Book(int id, String title, String author, int pages, String publisher, int publicationYear, String genre, String ISBN) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.publisher = publisher;
            this.publicationYear = publicationYear;
            this.genre = genre;
            this.ISBN = ISBN;
            System.out.println("A book with id " + id + " has been created");
        }

        public void openBook() {
            System.out.println("Book id " + id + " is opened");
        }

        public void readPage() {
            System.out.println("Book id " + id + " a page is being read");
        }

        public void closeBook() {
            System.out.println("Book id " + id + " is closed");
        }
    }


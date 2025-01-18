public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public LibraryBook() {
        this.title = "Default Title";
        this.author = "Default Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" by " + author + " is currently not available.");
            return false;
        }
    }

    // Display Book Details
    public void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("---------------------------");
    }

    // Main Method
    public static void main(String[] args) {
        // Creating books using the parameterized constructor
       LibraryBook book1 = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99, true);
       LibraryBook book2 = new LibraryBook("1984", "George Orwell", 12.99, false);

        // Displaying book details
        book1.display();
        book2.display();

        // Attempting to borrow books
        book1.borrowBook();
        book2.borrowBook();

        // Displaying updated availability
        book1.display();
        book2.display();
    }
}

import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

// Library class
class Library {
    private String name;
    private List<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main class to demonstrate aggregation
public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create Library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("Town Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Book2 is shared between libraries
        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}

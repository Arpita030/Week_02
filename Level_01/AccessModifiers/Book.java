public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("123-456-789", "Java Programming", "John Doe");
        book1.displayBookDetails();
        book1.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book1.getAuthor());
        System.out.println();

        EBook eBook1 = new EBook("987-654-321", "Advanced Java", "Emily Green", 50);
        eBook1.displayBookDetails();
        eBook1.displayEBookDetails();
    }
}

class EBook extends Book {
    private int fileSize;

    public EBook(String ISBN, String title, String author, int fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("File Size: " + fileSize + "MB");
    }
}
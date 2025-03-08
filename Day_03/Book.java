class Book {

    static String libraryName = "Arpita Library";
    private String title;
    private String author;

    private final int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library name is " + libraryName);
    }

    void bookDetail() {
        if (this instanceof Book) {
            System.out.println("Title of Book " + title);
            System.out.println("Author of Book " + author);
            System.out.println("isbn of Book " + isbn);
            System.out.println();

        } else {
            System.out.println("There is no Book");
        }
    }

    public static void main(String[] args) {
        // Create new accounts
        Book book = new Book("the untold story", "Sachin", 1001);
        Book book2 = new Book("Panchtantra", "Vishnu Sharma", 20034);

        displayLibraryName();
        book.bookDetail();
        book2.bookDetail();
    }
}
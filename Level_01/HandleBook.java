class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title of Book " + title);
        System.out.println("Author of Book " + author);
        System.out.println("Price of Book " + price);

    }
}

public class HandleBook {

    public static void main(String[] args) {
        Book b = new Book("Physics", "HC.verma", 30000);
        b.displayDetails();
    }
}
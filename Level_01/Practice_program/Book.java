public class Book {
    String title;
    String author;
    double price;

    Book() {
        this.title = "Harry potter";
        this.author = "Donald dump";
        this.price = 220;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title of book is " + title);
        System.out.println("Author of book is " + author);
        System.out.println("Title of book is " + price);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.display();
        Book book2 = new Book("the untold story of Arpita", "Arpita Goutam", 1000);
        book2.display();
    }
}

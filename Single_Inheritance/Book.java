package SingleInheritance;

class Book{
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    void copiesSold(){
        System.out.println("Number of books sold!!!");
    }

    void displayDetails(){
        System.out.println("Title of book is "+title);
        System.out.println("Publication Year: "+publicationYear);
    }

}

class Author extends Book{
    String name;
    String bio;
    int copies;
    Author(String title,int publicationYear,String name,String bio,int copies){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
        this.copies=copies;
    }

    @Override
    void copiesSold(){
        System.out.println("Author of "+title+" is "+name);
        System.out.println("Bio: "+bio);
        System.out.println("Number of copies of "+title+" sold is "+copies);
        System.out.println();
    }

}

class LibraryManagement{
    public static void main(String[] args) {
        Author author=new Author("Ikigai", 2016, "Hector Garcia", "Engineer", 500000);
        author.displayDetails();
        author.copiesSold();

        Author author2=new Author("Atomic Habits", 2018, "James Clear", "Teacher", 1500000);
        author2.displayDetails();
        author2.copiesSold();
    }
}

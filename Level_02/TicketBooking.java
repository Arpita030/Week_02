class MovieTicket{

    String movieName;
    int seatNumber;
    int Price;
    MovieTicket(String movieName, int seatNumber, int Price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.Price = Price;
    }
    int bookTicket(int seatNumber,int price){
        return seatNumber*price;
    }
    void display(){
        System.out.println("Movie Name: "+movieName);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Price: "+Price);
        System.out.println("Total Price: "+bookTicket(seatNumber,Price));
    }
}
public class TicketBooking {
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket("Avengers", 10, 100);
        m1.display();
        MovieTicket m2 = new MovieTicket("Joker", 20, 200);
        m2.display();
    }
}
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this.guestName = "Arpita";
        this.roomType = "Standard";
        this.nights = 2;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Hotel Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Using Default Constructor
        HotelBooking defaultBooking = new HotelBooking();
        defaultBooking.display();

        // Using Parameterized Constructor
        HotelBooking customBooking = new HotelBooking("Alice Johnson", "Deluxe", 5);
        customBooking.display();

        HotelBooking copiedBooking = new HotelBooking(customBooking);
        copiedBooking.display();
    }
}
package library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("B001", "Ikigai", "Chang"));
        libraryItems.add(new Magazine("M001", "National Geographic", "Diversified"));
        libraryItems.add(new DVD("D001", "Inception", "Christopher Nolan"));

        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
                reservableItem.reserveItem("Manish Patel");
                System.out.println("Availability after reservation: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            }

            System.out.println();
        }

    }
}
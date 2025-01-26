package library_management_system;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

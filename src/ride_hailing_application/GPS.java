package ride_hailing_application;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

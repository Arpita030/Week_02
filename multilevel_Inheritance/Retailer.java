package MultilevelInheritance;

class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }


    public String getOrderStatus() {
        return "Order placed";
    }


    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}


class ShippedOrder extends Order {
    protected String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }
}


class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;


    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}


public class Retailer {
    public static void main(String[] args) {

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORDER123", "2025-01-24", "TRKWE56789", "2025-01-25");

        deliveredOrder.displayOrderDetails();
        System.out.println(deliveredOrder.getOrderStatus());
    }
}

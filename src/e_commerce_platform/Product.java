package e_commerce_platform;

abstract class Product{
    private String productId;
    private String name;
    private double price;

    Product(String productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    abstract double calculateDiscount();

    void displayDetails(){
        System.out.println("Product ID: "+productId);
        System.out.println("Product: "+name);
        System.out.println("Price: "+price);
    }

    public double calculateFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price + tax - discount;
    }

}

package online_food_delivery_system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void processOrder(List<FoodItem> foodItems) {
        double totalOrderCost = 0;

        for (FoodItem item : foodItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }

            totalOrderCost += item.calculateTotalPrice();
            System.out.println();
        }

        System.out.println("Total Order Cost: " + totalOrderCost);
    }

    public static void main(String[] args) {
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new VegItem(" Chilli Paneer Masala", 220.0, 2));
        foodItems.add(new NonVegItem("Chicken ", 300.0, 3));

        for (FoodItem item : foodItems) {
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10.0);
            }
        }
        processOrder(foodItems);
    }

}

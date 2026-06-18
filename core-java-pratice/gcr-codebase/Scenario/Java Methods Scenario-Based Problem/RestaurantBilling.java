// .Method-Based Restaurant Billing System 
// Create separate methods to:
// Calculate food cost.
// Calculate GST.
// Calculate discount.
// Generate final bill.
// The main program should:
// Accept order details.
// Call the methods.
// Display the final payable amount.
// Use proper parameters and return types.

import java.util.Scanner;

public class RestaurantBilling {

    static double calculateFoodCost(int qty, double price) {
        return qty * price;
    }

    static double calculateGST(double amount) {
        return amount * 0.18;
    }

    static double calculateDiscount(double amount) {
        if (amount > 1000) {
            return amount * 0.10;
        }
        return 0;
    }

    static double generateFinalBill(double amount, double gst, double discount) {
        return amount + gst - discount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        double foodCost = calculateFoodCost(qty, price);
        double gst = calculateGST(foodCost);
        double discount = calculateDiscount(foodCost);
        double finalBill = generateFinalBill(foodCost, gst, discount);

        System.out.println("Restaurant Bill -");
        System.out.println("Food Cost: " + foodCost);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);
    }
}

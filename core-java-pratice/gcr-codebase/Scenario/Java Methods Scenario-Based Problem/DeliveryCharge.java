// 3. Method Overloading Delivery Charge System 
// A delivery company charges customers differently.
// Create overloaded methods:
// calculateCharge(int distance)
// calculateCharge(int distance, int weight)
// calculateCharge(int distance, int weight, boolean expressDelivery)
// Display the final delivery charge based on the method called.

public class DeliveryCharge {

    static double calculateCharge(int distance) {
        return distance * 5;
    }

    static double calculateCharge(int distance, int weight) {
        return (distance * 5) + (weight * 2);
    }

    static double calculateCharge(int distance, int weight, boolean expressDelivery) {

        double charge = (distance * 5) + (weight * 2);

        if (expressDelivery) {
            charge = charge + 100;
        }

        return charge;
    }

    public static void main(String[] args) {

        System.out.println("Charge 1: " + calculateCharge(10));

        System.out.println("Charge 2: " + calculateCharge(10, 5));

        System.out.println("Charge 3: " +
                calculateCharge(10, 5, true));
    }
}
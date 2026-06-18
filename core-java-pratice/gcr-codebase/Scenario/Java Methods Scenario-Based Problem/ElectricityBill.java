// 1. Electricity Bill Calculator
// An electricity department wants to automate bill calculation.
// Create methods to:
// Accept units consumed.
// Calculate the bill amount.
// Display customer bill details.
// The main method should call all required methods and display the final bill.

import java.util.Scanner;

public class ElectricityBill {

    static int acceptUnits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        return sc.nextInt();
    }
    static double calculateBill(int units) {
        double bill;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = units * 7;
        } else {
            bill = units * 10;
        }

        return bill;
    }
    static void displayBill(int units, double bill) {
        System.out.println("Electricity Bill:- ");
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: " + bill);
    }
    public static void main(String[] args) {

        int units = acceptUnits();
        double bill = calculateBill(units);

        displayBill(units, bill);
    }
}
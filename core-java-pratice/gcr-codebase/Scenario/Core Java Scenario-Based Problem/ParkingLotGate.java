// 3.   Parking Lot Gate System 🚗
// Develop a smart parking system.
// ● Options: Park, Exit, Show Occupancy
// ●  Use switch-case for the menu.
// ●  while loop to continue until the parking lot is full or the user exits.

import java.util.Scanner;

public class ParkingLotGate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 5;
        int occupied = 0;
        int choice;

        while (true) {

            System.out.println("\n--- Parking Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit Program");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle Parked.");
                    } else {
                        System.out.println("Parking Lot Full!");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle Exited.");
                    } else {
                        System.out.println("No Vehicles in Parking.");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Spaces: " + occupied);
                    System.out.println("Available Spaces: " + (capacity - occupied));
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }

            if (occupied == capacity) {
                System.out.println("Parking Lot is Full.");
            }
        }
    }
}
// 1.   Metro Smart Card Fare Deduction 🚇
// In Delhi Metro, fare varies by distance.
// ●  Ask the user for distance.
// ●  Calculate fare using ternary operator.
// ●  Deduct from smart card balance.
// Loop until balance is exhausted or the user quits

import java.util.Scanner;
public class MetroSmartCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 200;
        char choice;

        do {
            System.out.println("Current Balance: ₹" + balance);

            System.out.print("Enter distance travelled (km): ");
            int distance = sc.nextInt();

            int fare;

            if (distance <= 5) {
                fare = 10;
            } else if (distance <= 15) {
                fare = 20;
            } else {
                fare = 30;
            }

            if (balance >= fare) {
                balance = balance - fare;

                System.out.println("Fare Deducted: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient Balance!");
                break;
            }

            System.out.println("Do you want another trip? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Delhi Metro!");
        sc.close();
    }
}
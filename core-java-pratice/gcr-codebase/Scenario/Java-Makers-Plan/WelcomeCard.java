// Ravi just joined a coding guild. Store his name, age, rank, salary, and
// membership fee (float) using correct data types. Compute his
// annual bonus (12% of salary), cast it to int, and print a formatted
// welcome card.

public class WelcomeCard {
        public static void main(String[] args) {
        String name="Ravi";
        int age=25;
        int rank=1;
        int salary=50000;
        float membership_fee = 100.50f;
        float annual_bonus = salary*12/100;
        int bouns = (int) annual_bonus;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Rank: "+rank);
        System.out.println("Salary: "+salary);
        System.out.println("Membership Fee: "+membership_fee);
        System.out.println("Bonus: "+bouns);
    }

}

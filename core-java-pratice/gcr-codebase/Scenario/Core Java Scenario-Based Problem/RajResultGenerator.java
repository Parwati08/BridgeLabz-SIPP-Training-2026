// 2.    Raj’s Result Generator
// Raj runs a coaching center. He needs to generate results.
// ● Input 5 subject marks.
// ● Calculate average.
// ● Switch to assign grades.
// ● for-loop to iterate over subjects.

import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;

        System.out.println("Average Marks = " + average);

        int gradeChoice;

        if (average >= 90)
            gradeChoice = 1;
        else if (average >= 75)
            gradeChoice = 2;
        else if (average >= 60)
            gradeChoice = 3;
        else if (average >= 40)
            gradeChoice = 4;
        else
            gradeChoice = 5;

        switch (gradeChoice) {
            case 1:
                System.out.println("Grade A");
                break;
            case 2:
                System.out.println("Grade B");
                break;
            case 3:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Fail");
        }
        sc.close();
    }
}
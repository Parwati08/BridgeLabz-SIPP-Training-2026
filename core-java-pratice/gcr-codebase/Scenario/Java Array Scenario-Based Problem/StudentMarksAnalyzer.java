// 1. Student Marks Analyzer 
// A teacher has recorded marks of students in an array.
// Write a program that:
// Accepts marks of students.
// Finds the highest and lowest marks.
// Counts how many students scored above 75.
// Calculates the average marks.
// Displays all marks greater than the average.

import java.util.Scanner;
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        int highest = 0;
        int lowest = 100;
        int countAbove75 = 0;
        int sum = 0;
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            if (marks[i] > 75) {
                countAbove75++;
            }
        }
        double average = (double) sum / n;
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Students Scoring Above 75: " + countAbove75);
        System.out.println("Average Marks: " + average);
        System.out.println("Marks Greater Than Average:");
        for (int i = 0; i < n; i++) {
            if (marks[i] > average) {
                System.out.print(marks[i] + " ");
            }
        }
        sc.close();
    }
}
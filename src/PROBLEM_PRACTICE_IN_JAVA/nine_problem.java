package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class nine_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you Maths marks (0 to 100) : ");
        int m = sc.nextInt();

        System.out.println();

        System.out.print("Enter you English marks (0 to 100) : ");
        int e = sc.nextInt();

        System.out.println();

        System.out.print("Enter you Physics marks (0 to 100) : ");
        int p = sc.nextInt();

        System.out.println();

        System.out.print("Enter you Chemistry marks (0 to 100) : ");
        int c = sc.nextInt();

        System.out.println();

        System.out.print("Enter you Biology marks (0 to 100) : ");
        int b = sc.nextInt();

        System.out.println();

        int total_marks = m + e + p + c + b;
        System.out.println("Your total marks are : " + total_marks);
        System.out.println();

        int average = total_marks / 5;
        System.out.println("Percentage : " + average + "%");
        System.out.println();


        if (average >= 95 && average < 100) {
            System.out.println("Grade: A+");
        } else if (average >= 85 && average < 95) {
            System.out.println("Grade: A");
        } else if (average >= 75 && average < 85) {
            System.out.println("Grade: B+");
        } else if (average >= 65 && average < 75) {
            System.out.println("Grade: B");
        } else if (average >= 55 && average < 65) {
            System.out.println("Grade: C+");
        } else if (average >= 45 && average < 55) {
            System.out.println("Grade: C");
        } else if (average >= 35 && average < 45) {
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Fail");
        }
    }
}

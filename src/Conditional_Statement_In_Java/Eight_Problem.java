package Conditional_Statement_In_Java;

import java.util.Scanner;

public class Eight_Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subOne;
        int subTwo;
        int subThree;
        int subFour;
        int subFive;

        while (true) {
            System.out.print("Enter the marks of first subject : ");
            subOne = sc.nextInt();

            if (subOne >= 0 && subOne <= 100) {
                break;
            } else {
                System.out.println("Invalid marks! Enter marks between 0 to 100.");
            }
        }

        while (true) {
            System.out.print("Enter the marks of second subject : ");
            subTwo = sc.nextInt();

            if (subTwo >= 0 && subTwo <= 100) {
                break;
            } else {
                System.out.println("Invalid marks! Enter marks between 0 to 100.");
            }
        }

        while (true) {
            System.out.print("Enter the marks of third subject : ");
            subThree = sc.nextInt();

            if (subThree >= 0 && subThree <= 100) {
                break;
            } else {
                System.out.println("Invalid marks! Enter marks between 0 to 100.");
            }
        }

        while (true) {
            System.out.print("Enter the marks of fourth subject : ");
            subFour = sc.nextInt();

            if (subFour >= 0 && subFour <= 100) {
                break;
            } else {
                System.out.println("Invalid marks! Enter marks between 0 to 100.");
            }
        }

        while (true) {
            System.out.print("Enter the marks of fifth subject : ");
            subFive = sc.nextInt();

            if (subFive >= 0 && subFive <= 100) {
                break;
            } else {
                System.out.println("Invalid marks! Enter marks between 0 to 100.");
            }
        }

        int sum = subOne + subTwo + subThree + subFour + subFive;

        int percentage = sum / 5;

        System.out.println();
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("A+");
        } else if (percentage >= 80) {
            System.out.println("A");
        } else if (percentage >= 70) {
            System.out.println("B");
        } else if (percentage >= 60) {
            System.out.println("C");
        } else if (percentage >= 50) {
            System.out.println("D");
        } else if (percentage >= 40) {
            System.out.println("E");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
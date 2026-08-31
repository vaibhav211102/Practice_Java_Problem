package PROBLEM_PRACTICE_IN_JAVA;

import java.util.*;

public class forteen_problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "java123";

        int attempts = 3;

        System.out.println("Enter your username and password for login.");
        System.out.println();

        for (int i = 1; i <= 3; i++) {

            System.out.println("Attempt " + i);

            System.out.print("Enter username : ");
            String enteredUsername = sc.nextLine();

            System.out.print("Enter password : ");
            String enteredPassword = sc.nextLine();

            if (enteredUsername.equals(correctUsername)
                    && enteredPassword.equals(correctPassword)) {

                System.out.println("Login Successful!");
                break;

            } else {

                attempts--;

                if (!enteredUsername.equals(correctUsername)) {
                    System.out.println("Invalid Username");
                } else {
                    System.out.println("Invalid Password");
                }

                if (attempts > 0) {
                    System.out.println("Attempts remaining : " + attempts);
                } else {
                    System.out.println("Account Locked!");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}


package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class fifteen_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        while(true) {

            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");


            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your Balance is : " + balance);
            } else if (choice == 2) {
                System.out.println("Deposit : ");
                System.out.print("Enter amount to deposit : ");
                double amount = sc.nextDouble();

                if (amount > 0) {
                    balance += amount;
                    System.out.println("Your Balance is : " + balance);
                }
                else {
                    System.out.println("You can not deposit amount.");
                }
            } else if (choice == 3) {
                System.out.print("Enter the amount to withdraw : ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance && withdraw > 0) {
                    balance -= withdraw;
                    System.out.println("Your Balance is : " + balance);
                }
                else {
                    System.out.println("You can not withdraw amount.");
                }
            } else if (choice == 4) {
                    System.out.println("Exits...");
                    break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

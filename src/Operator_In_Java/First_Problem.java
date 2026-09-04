package Operator_In_Java;
import java.util.*;
public class First_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        while(true) {

            System.out.println("Enter Your Choice (1 to 4 or -1 to exit) : ");
            int choice = sc.nextInt();
            System.out.println("1. Addition : ");
            System.out.println("2. Substraction : ");
            System.out.println("3. Multiplication : ");
            System.out.println("4. Division : ");
            System.out.println("5. Exit (Enter -1)");

            if (choice == 1) {
                System.out.println("Addition : " + (a + b));
            } else if (choice == 2) {
                System.out.println("Substraction : " + (a - b));
            } else if (choice == 3) {
                System.out.println("Multiplication : " + (a * b));
            } else if (choice == 4) {
                System.out.println("Division : "  + (a / b));
            } else if (choice == -1) {
                System.out.println("Exist");
                break;
            }else {
                System.out.println("Your entered the wrong choice please select the valid option.");
            }
        }
    }
}

package Conditional_Statement_In_Java;
import java.util.Scanner;
public class First_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num <= 100 && num >= 1) {
            if (num % 2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        else {
            System.out.println("You entered wrong range input.");
        }

        if (num <= 100 && num >= 1) {
            System.out.println("The number lies between 1 to 100.");
        }else {
            System.out.println("The number is not lies between 1 to 100");
        }
    }
}

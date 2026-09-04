package Conditional_Statement_In_Java;
import java.util.Scanner;
public class Second_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if ((num % 3 == 0) ^ (num % 7 == 0)) {
            System.out.println("Number is divisible by either 3 or 7, but not both.");
        } else {
            System.out.println("Condition not satisfied.");
        }
    }
}

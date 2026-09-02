package PROBLEM_PRACTICE_IN_JAVA;
import java.util.Scanner;
public class twenty_seven_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int x = sc.nextInt();

        System.out.print("Enter the second number : ");
        int y = sc.nextInt();

        System.out.print("Enter the third number : ");
        int z = sc.nextInt();

        if (x == y && y == z) {
            System.out.println("All the numbers are equals.");
        } else if (x == y || y == z || z == x) {
            System.out.println("Two numbers are equals.");
        }else {
            System.out.println("Not any numbers are equals.");
        }
    }
}

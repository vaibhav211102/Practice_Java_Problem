package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class twenty_three_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int temp = number;
        double arm = 0;

        while (number != 0){
            double rem = number % 10;
            arm += (Math.pow(rem,3));
            number = number / 10;
        }

        if (arm == temp) {
            System.out.println("The given number is armstrong.");
        }
        else {
            System.out.println("The given number is not armstrong.");
        }
    }
}

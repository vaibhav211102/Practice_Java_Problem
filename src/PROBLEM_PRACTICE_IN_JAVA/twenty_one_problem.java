package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class twenty_one_problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int number = sc.nextInt();

        int reverse = 0;
        int temp = number;

        while (number != 0){

            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number / 10;
        }

        if (temp == reverse) {
            System.out.println("The given number is palindrome!");
        }
        else{
            System.out.println("The given number is not palindrome!");
        }
    }
}

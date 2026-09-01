package PROBLEM_PRACTICE_IN_JAVA;
import java.util.Scanner;
public class twenty_two_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number is prime.");
        }
        else {
            System.out.println("The number is not prime.");
        }
    }
}

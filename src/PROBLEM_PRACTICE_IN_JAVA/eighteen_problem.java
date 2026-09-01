package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class eighteen_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Sum of 'n' number is : " + sum);
    }
}

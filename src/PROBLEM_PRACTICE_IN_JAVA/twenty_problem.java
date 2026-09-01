package PROBLEM_PRACTICE_IN_JAVA;

import java.util.Scanner;

public class twenty_problem {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number : ");
                int number = sc.nextInt();

                int count = 0;
                int rev = 0;

                while (number != 0) {

                    int rem = number % 10;
                    rev = (rev * 10) + rem;
                    count++;
                    number = number / 10;
                }

                System.out.println("Number of digit in number : " + count);

        System.out.println("Reverse of the number : " + rev);
    }
}

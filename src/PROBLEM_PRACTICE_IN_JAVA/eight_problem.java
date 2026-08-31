package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class eight_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.print("Enter the third number : ");
        int c = sc.nextInt();

        if (a >= b && a >= c){
            System.out.println("a is greater");
        } else if (b >= c && b >= a ) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
    }
}

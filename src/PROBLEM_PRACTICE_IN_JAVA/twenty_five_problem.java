package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class twenty_five_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number : ");
        int d = sc.nextInt();

        if (a > b && a > c && a > d) {
            System.out.println("a is greater");
        } else if (b > a && b > c && b > d) {
            System.out.println("b is greater");
        } else if (c > b && c > a && c > d) {
            System.out.println("c is greater");
        }else {
            System.out.println("d is greater");
        }
    }
}

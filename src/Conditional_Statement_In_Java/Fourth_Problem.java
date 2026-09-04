package Conditional_Statement_In_Java;
import java.util.Scanner;
public class Fourth_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        if (a > b && a < c) {
            System.out.println("a is second largest.");
        } else if (b > a && b < c) {
            System.out.println("b is second largest.");
        }else {
            System.out.println("c is second largest.");
        }
    }
}

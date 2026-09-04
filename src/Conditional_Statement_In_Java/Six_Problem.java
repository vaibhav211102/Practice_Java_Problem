package Conditional_Statement_In_Java;
import java.util.Scanner;
public class Six_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {

            if (a > b) {
                System.out.println(a + " is largest even number.");
            } else {
                System.out.println(b + " is largest even number.");
            }

        } else if (a % 2 == 0 && c % 2 == 0) {

            if (a > c) {
                System.out.println(a + " is largest even number.");
            } else {
                System.out.println(c + " is largest even number.");
            }

        } else if (b % 2 == 0 && c % 2 == 0) {

            if (b > c) {
                System.out.println(b + " is largest even number.");
            } else {
                System.out.println(c + " is largest even number.");
            }

        } else if (a % 2 == 0) {

            System.out.println(a + " is largest even number.");

        } else if (b % 2 == 0) {

            System.out.println(b + " is largest even number.");

        } else if (c % 2 == 0) {

            System.out.println(c + " is largest even number.");

        } else {

            System.out.println("NONE.");

        }
    }
}

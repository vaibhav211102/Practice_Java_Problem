package Conditional_Statement_In_Java;

import java.util.Scanner;

public class Five_Problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("a lies between b and c.");

        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println("b lies between a and c.");

        } else {
            System.out.println("c lies between a and b.");
        }
    }
}
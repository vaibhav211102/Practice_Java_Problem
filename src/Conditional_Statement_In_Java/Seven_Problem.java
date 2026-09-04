package Conditional_Statement_In_Java;
import java.util.Scanner;
public class Seven_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0) {
            if (a > b) {
                System.out.println("a is largest positive.");
            }
            else{
                System.out.println("b is largest positive.");
            }

        } else if (a > 0 && c > 0) {
            if (a > c) {
                System.out.println("a is largest positive.");
            }
            else {
                System.out.println("c is largest positive.");
            }
        } else if (b > 0 && c > 0) {
            if (b > c){
                System.out.println("b is largest positive.");
            }
            else {
                System.out.println("c is largest positive.");
            }
        } else if (a > 0) {
            System.out.println("a is largest positive");
        } else if (b > 0) {
            System.out.println("b is largest positive.");
        } else if (c > 0) {
            System.out.println("c is largest positive.");
        } else {
            System.out.println("None.");
        }
    }
}

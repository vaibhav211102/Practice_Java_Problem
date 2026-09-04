package Operator_In_Java;
import java.util.Scanner;
public class Six_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        int amount = sc.nextInt();

        int notes500 = amount / 500;
        amount %= 500;

        int notes200 = amount / 200;
        amount %= 200;

        int notes100 = amount / 100;
        amount %= 100;

        int notes50 = amount / 50;
        amount %= 50;

        int notes10 = amount / 10;
        amount %= 10;

        System.out.println("₹500 notes = " + notes500);
        System.out.println("₹200 notes = " + notes200);
        System.out.println("₹100 notes = " + notes100);
        System.out.println("₹50 notes  = " + notes50);
        System.out.println("₹10 notes  = " + notes10);
    }
}

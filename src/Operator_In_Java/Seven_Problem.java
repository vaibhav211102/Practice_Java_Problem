package Operator_In_Java;
import java.util.Scanner;
public class Seven_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int number = sc.nextInt();

        int hundreds = number / 100;
        number %= 100;

        int tens = number / 10;
        number %= 10;

        int units = number % 10;

        System.out.println("Hundreds = " + hundreds);
        System.out.println("Tens     = " + tens);
        System.out.println("Units    = " + units);
    }
}

package Operator_In_Java;
import java.util.Scanner;
public class Ternary_Absolute_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int result = number < 0 ? -number : number;

        System.out.println(result);
    }
}

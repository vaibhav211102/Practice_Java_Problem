package Operator_In_Java;
import java.util.Scanner;
public class Ternary_Opr_Problem_First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int largest = num2 > num1 ? num2 : num1;

        System.out.println("Larger Number : " + largest);
    }
}

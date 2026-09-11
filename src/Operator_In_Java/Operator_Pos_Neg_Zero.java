package Operator_In_Java;
import java.util.Scanner;
public class Operator_Pos_Neg_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
}

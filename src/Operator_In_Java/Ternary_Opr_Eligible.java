package Operator_In_Java;
import java.util.Scanner;
public class Ternary_Opr_Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");

        int age = sc.nextInt();

        String eligible = age >= 18 ? "You can Vote" : "You can not Vote";

        System.out.println(eligible);
    }
}

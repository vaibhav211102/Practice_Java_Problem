package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class twelfth_problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the units that are consumed : ");
        int units = sc.nextInt();

        System.out.println("Units Consumed : " + units);

        if (units < 0) {
            System.out.println("Invalid units");
        }
        else if (units <= 100) {
            System.out.println("Electricity Bill $5/unit : " + (units * 5));
        }
        else if (units <= 200) {
            System.out.println("Electricity Bill $7/unit : " + (units * 7));
        }
        else if (units <= 300) {
            System.out.println("Electricity Bill $10/unit : " + (units * 10));
        }
        else {
            System.out.println("Electricity Bill $15/unit : " + (units * 15));
        }
    }
}

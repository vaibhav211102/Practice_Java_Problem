package Conditional_Statement_In_Java;
import java.util.Scanner;
public class Electricity_Bill_Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units : ");
        int units = sc.nextInt();
        int bill = 0;

        if (units > 0){
            if (units <= 100) {
                bill = 5 * units;
                System.out.println("Your electricity is : " + bill);
            } else if (units <= 200) {
                bill = 10 * units;
                System.out.println("Your electricity is : " + bill);
            } else if (units <= 500) {
                bill = 15 * units;
                System.out.println("Your electricity is : " + bill);
            }else {
                bill = 25 * units;
                System.out.println("Your electricity is : " + bill);
            }
        }else {
            System.out.println("You entered wrong electricity bill units.");
        }
    }
}

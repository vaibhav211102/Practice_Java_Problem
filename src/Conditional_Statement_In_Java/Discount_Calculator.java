package Conditional_Statement_In_Java;
import java.util.Scanner;
public class Discount_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of purchase : ");
        int purchase = sc.nextInt();
        int discount_Money = 0;

        if (purchase < 0) {
            System.out.println("Invalid purchase amount");
        }

        if (purchase >= 10000) {
            discount_Money = (purchase * 20) / 100;
            purchase -= discount_Money;
            System.out.println("Pay Amount : " + purchase);
        } else if ( purchase >= 5000) {
            discount_Money = (purchase * 10) / 100;
            purchase -= discount_Money;
            System.out.println("Pay Amount : " + purchase);
        } else if (purchase >= 2000) {
            discount_Money = (purchase * 5) / 100;
            purchase -= discount_Money;
            System.out.println("Pay Amount : " + purchase);
        }else{
            System.out.println("Pay Amount : " + purchase);
        }
    }
}

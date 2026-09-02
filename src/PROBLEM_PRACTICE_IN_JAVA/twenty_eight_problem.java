package PROBLEM_PRACTICE_IN_JAVA;
import java.util.Scanner;
public class twenty_eight_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("Uppercase String");
                break;
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lowercase String");
                break;
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("String contain Numbers");
                break;
            }else {
                System.out.println("String contain Special Character");
                break;
            }
        }
    }
}

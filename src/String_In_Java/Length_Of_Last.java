package String_In_Java;
import java.util.Scanner;
public class Length_Of_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        int count = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                continue;
            }
            if (s.charAt(i) == ' ' && count > 0) {
                break;
            }
            count++;
        }

        System.out.println("Length of last word = " + count);
    }
}

package String_In_Java;
import java.util.Scanner;
public class Remove_Duplicate_From_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String s = sc.nextLine();

        String result = "";
        Boolean duplicate = false;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    duplicate = true;
                    break;
                }
                if (duplicate == false){
                    result = result + s.charAt(i);
                }
            }
        }

        System.out.println(result);
    }
}

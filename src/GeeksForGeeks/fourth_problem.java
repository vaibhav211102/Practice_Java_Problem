package GeeksForGeeks;
import java.util.*;
public class fourth_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;

        int a = 0;
        int b = 1;
        while (i <= n){

            int temp = a + b;
            System.out.print(a + " ");
            a = b;
            b = temp;
            i++;
        }
    }
}

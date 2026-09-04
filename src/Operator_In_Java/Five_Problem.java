package Operator_In_Java;
import java.util.Scanner;
public class Five_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Second : ");
        int total_seconds = sc.nextInt();

        int hours = total_seconds / 3600;

        int remainingseconds = total_seconds % 3600;

        int minutes = remainingseconds / 60;

        int seconds = remainingseconds % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}

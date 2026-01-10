// Book: Let Us Java
// Chapter 4 – Question K
// Problem: Determine wether a year is leap year or not.
import java.util.Scanner;

public class Ch4QK {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year  : ");
        int y = sc.nextInt();

        String result = (y % 4 ==0 && (y%100 != 0 || y%400 ==0))
        ?"Year is leap year." 
        : "Year is not leap year.";
        System.out.println(result);

        sc.close();
    }
}

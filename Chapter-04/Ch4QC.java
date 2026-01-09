// Book: Let Us Java
// Chapter 4 – Question C
// Problem: Determine the absolute value of a number

import java.util.Scanner;

public class Ch4QC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Absolute Value  = "+ (-1)*num);
            
        } else {
            System.out.println("Absolute Value = "+num);
            
        }
        sc.close();
    }
}

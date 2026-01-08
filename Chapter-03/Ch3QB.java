// Book: Let Us Java
// Chapter 3 – Question B
// Problem: Calculate sum of digits of a five-digit number

import java.util.Scanner;

public class Ch3QB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int digitSum = 0;
        int digit;

        while(num != 0) {
            digit = num % 10;
            digitSum += digit;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + digitSum);

        sc.close();
    }
}

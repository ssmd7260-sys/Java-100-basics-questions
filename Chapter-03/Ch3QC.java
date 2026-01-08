// Book: Let Us Java
// Chapter 3 – Question C
// Problem: Reverse a five-digit number

import java.util.Scanner;

public class Ch3QC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int reverse = 0;
        int digit;

        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}


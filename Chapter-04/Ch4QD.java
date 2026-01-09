// Book: Let Us Java
// Chapter 4 – Question D
// Problem: Determine the youngest among Ram, Shyam and Ajay

import java.util.Scanner;

public class Ch4QD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of Ram: ");
        int rAge = sc.nextInt();

        System.out.print("Enter the age of Shyam: ");
        int sAge = sc.nextInt();

        System.out.print("Enter the age of Ajay: ");
        int aAge = sc.nextInt();

        // Using ternary operator to find the youngest person
        String youngest =
                (rAge < sAge)
                    ? (rAge < aAge ? "Ram is youngest" : "Ajay is youngest")
                    : (sAge < aAge ? "Shyam is youngest" : "Ajay is youngest");

        System.out.println(youngest);

        sc.close();
    }
}

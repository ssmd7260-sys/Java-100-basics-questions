// Book: Let Us Java
// Chapter 4 – Question A
// Problem : determine wether a number is odd or even

import java.util.Scanner;

public class Ch4QB {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an integer:");
        int num =  sc.nextInt();

        if (num/2 == 0) {
            System.out.println("number is even");
        }else{
            System.out.println("numbr is odd");
        }
        sc.close();
    }
    
}

// Book: Let Us Java
// Chapter 3 – Question A
// Problem: Swap two numbers using a temporary variable
import java.util.Scanner;
public class Ch3QA {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("please enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("c = "+num1);
        System.out.println("d = "+num2);

        // swapping the number.......
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("after swapping the value of c and d :");
        System.out.println("c = "+num1);
        System.out.println("d = "+num2);

        sc.close();


    }
    
}

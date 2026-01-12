// Book: Let Us Java
// Chapter 4 – Question N
// Problem : Determine wether a character is a digit or not.
import java.util.Scanner;

public class Ch4QN {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char c = sc.next().charAt(0);

        String result = ((c >= 48 && c <= 57) )
        ?"Charcter is a digit"
        :"Character is not a digit";
        System.out.println(result);

        sc.close();
    }
}


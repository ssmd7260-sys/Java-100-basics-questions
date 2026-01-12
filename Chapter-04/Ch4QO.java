// Book: Let Us Java
// Chapter 4 – Question O
// Problem : Determine wether a character is  alphanumeric or not.


import java.util.Scanner;

public class Ch4QO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char c = sc.next().charAt(0);

        String result = ((c >= 48 && c <= 57) 
        || (c >= 65 && c <= 90)
        ||(c >= 97 && c <= 122))
        ?"Charcter is a alphanumeric"
        :"Character is not a alphanumeric";
        System.out.println(result);

        sc.close();
    }
}

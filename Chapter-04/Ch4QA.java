// Book: Let Us Java
// Chapter 4 – Question A
// Problem: Determine profit, loss or no profit–no loss based on cost price and selling price


import java.util.*;

public class Ch4QA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price :");
        float costPrice = sc.nextFloat();

        System.out.print("Enter the selling price :");
        float sellingPrice = sc.nextFloat();

        if(sellingPrice < costPrice){
            System.out.println("Loss  = "+(costPrice -sellingPrice));
        }
        else if(sellingPrice>costPrice){
            System.out.println(" Profit = "+(sellingPrice-costPrice));
        }
        else{
            System.out.println("There is no profit or loss.");
        }

        sc.close();
    }
}

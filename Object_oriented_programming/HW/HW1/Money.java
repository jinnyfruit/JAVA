/*
 file name: HW1-3
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class Money {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        int price;
        System.out.println("Type a price of an item:");
        price = scanner.nextInt();

        int change, temp;
        change = 100 - price;   //total change
        temp = change;

       int quarter, dime, nickel;   //each of coin has value of 25,10,5

       quarter = change/25;
       change %= 25;
       dime = change/10;
       change %=10;
       nickel = change/5;

       System.out.println("Change is "+ temp);
       System.out.println("quarter: " + quarter );
       System.out.println("dime: " + dime);
       System.out.println("nickel: " + nickel);
   }
}

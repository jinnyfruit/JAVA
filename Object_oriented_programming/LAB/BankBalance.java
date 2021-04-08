 /*
 file name: Using if-else
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class BankBalance {

   public static final double OVERDRAWN_PENALTY = 8.00;
   public static final double INTERSET_RATE = 0.02; //이율

   public static void main(String[] args){

    double balance;

    System.out.println("Enter your checking account balance:");
    Scanner scanner = new Scanner(System.in);
    balance = scanner.nextDouble();
    System.out.println("Original balance " + balance + " $");

    if(balance >= 0)
         balance += (INTERSET_RATE * balance)/12;
    else
         balance -= balance - OVERDRAWN_PENALTY;

    System.out.println("After adjusting for one month");
    System.out.println("of interest and penalties,");
    System.out.println("your new balance is " + balance + " $");

   }
}

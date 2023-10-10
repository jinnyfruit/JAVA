 /*
 file name: Practice 4
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class BankAccount {
     public double rate;
     public double amount;

     public void showNewBalance(){
         double newAmount = amount + (rate/100.0) * amount;
         System.out.println("With interest added, the new amount is " + newAmount + "$");
     }

     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         BankAccount myAccount = new BankAccount();

         System.out.println("Type your bank account amount: ");
         myAccount.amount = scanner.nextInt();

         System.out.println("Type your bank account rate: ");
         myAccount.rate = scanner.nextInt();
         myAccount.showNewBalance();

         double newAmount;
         System.out.println(" Type your wish amount: ");
         newAmount = scanner.nextInt();
         System.out.println("I wish my account were " + newAmount + "$");
     }
 }

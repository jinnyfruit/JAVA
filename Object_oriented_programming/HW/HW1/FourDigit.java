/*
 file name: HW1-1 (1a)
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class FourDigit {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int num, digit;
       System.out.println("type a four-digit integer:");
       num = scanner.nextInt();

       digit = num/1000;
       num = num%1000;
       System.out.println(digit);

       digit = num/100;
       num = num%100;
       System.out.println(digit);

       digit = num/10;
       num = num%10;
       System.out.println(digit);

       digit = num;
       System.out.println(digit);
   }
}

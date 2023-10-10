/*
 file name: HW1-1 (1b)
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class FtoC {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       float Fah;
       System.out.println("Type a temperature in Fahrenheit:");
       Fah = scanner.nextFloat();

       float Cel;
       Cel = 5*(Fah-32)/9;
       System.out.println(Fah + "Fahrenheit is " + Cel + "Celsius");
   }
}

 /*
 file name: Switch statement
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class Year {

     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
         int year;
         System.out.println("Type your grade");
         year = scanner.nextInt();

         switch(year){
             case 1:
                 System.out.println("Freshman");
                 break;
             case 2:
                 System.out.println("Sophomore");
                 break;
             case 3:
                 System.out.println("Junior");
                 break;
             case 4:
                 System.out.println("Senior");
                 break;
             case 5:
                 System.out.println("Super senior");    
             default:
                 System.out.println("unknown");
         }
     }
 }

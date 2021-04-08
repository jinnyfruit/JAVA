 /*
 file name: Lab 5-2
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class Calculation {

   public static void main(String[] args){
       int i,num;
       int max,min;
       double sum = 0, count =0;
       String answer;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter all integers and enter negative one.");
       num = scanner.nextInt();
       max = num;
       min = num;

       while(num>0) {
           count++;
           sum += num;
           if (max < num)
               max = num;
           if (min > num)
               min = num;
           num = scanner.nextInt();
       }
       System.out.println("Maximum is " + max);
       System.out.println("Minimum is " + min);
       System.out.println("Average is "+ (sum/count));
   }
 }

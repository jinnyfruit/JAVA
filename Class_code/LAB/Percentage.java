 /*
 file name: Class practice
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class Percentage {

   public static void main(String[] args) {
       int i, num;
       int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;    //stands for A count B count C count...to F count

       Scanner scanner = new Scanner(System.in);

       System.out.println("Type scores you wanna grade. End with negative integer.");
       num = scanner.nextInt();

       while (num >= 0 && num <= 100) {

           if (num <= 100 && num >= 90)      //count A
               count1++;
           else if (num <= 89 && num >= 80)      //count B
               count2++;
           else if (num <= 79 && num >= 70)      //count C
               count3++;
           else if (num <= 69 && num >= 60)      //count D
               count4++;
           else     //count F
               count5++;
           num = scanner.nextInt();
       }
       System.out.println("A count: " + count1);    //prints all count of grades and total count
       System.out.println("B count: " + count2);
       System.out.println("C count: " + count3);
       System.out.println("D count: " + count4);
       System.out.println("F count: " + count5);
       System.out.println("Total count: " + (count1+count2+count3+count4+count5));
   }
 }

 /*
 file name: named Constants
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class CircleCalculation {
   public static final double PI = 3.141592;

   public static void main(String[] args)
   {
       double radius;   //in inches
       double area;     //in square inches
       Scanner scanner = new Scanner(System.in);

       System.out.println(" Enter the radius of a circle in inches:");
       radius = scanner.nextDouble();
       area = PI * radius * radius;
       System.out.println("A Circle of radius " + radius + " inches");
       System.out.println("has an area of " + area + " square inches.");
   }
}

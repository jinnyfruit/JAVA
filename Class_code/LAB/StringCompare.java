 /*
 file name: String memory test
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class StringCompare {

        public static void main (String[] args){

            String line1, line2, line3, line4;
            line1 = "Jinny";
            line2 = "jinny";
            line3 = "jinny";
            line4 = new String("Jinny");

            if(line1 == line2)
                System.out.println(line1 + " == " + line2 + " is " + " true.");
            else
                System.out.println(line1 + " == " + line2 + " is " + " false.");

            if(line2 == line3)
                System.out.println(line2 + " == " + line3 + " is " + " true.");
            else
                System.out.println(line2 + " == " + line3 + " is " + " false.");

            if(line1 == line4)
                System.out.println(line1 + " == " + line4 + " is " + " true.");
            else
                System.out.println(line1 + " == " + line4 + " is " + " false.");

            System.out.println();

            if(line1.equals(line4))
                System.out.println("true");
            else
                System.out.println("false");

            if(line2.equals(line4))
                System.out.println("true");
            else
                System.out.println("false");

            if(line2.equalsIgnoreCase(line4))   //equalsIgnoreCase method checks string regardless of upper,lowercase.
                System.out.println("true");
            else
                System.out.println("false");
        }
}

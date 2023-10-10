/*
 file name: 2-1
 author: Ji woo Kim
 modified; 04.19, 2021
*/
import java.util.Scanner;
public class hw2_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line;

        String profane1 = "cat";   //define profanes in string type
        String profane2 = "dog";
        String profane3 = "llama";

        System.out.println("type a String:");
        line = scanner.nextLine();

        String line_compare = line.toLowerCase(); 

        if(line_compare.contains(profane1)){
            System.out.println("does contain " + profane1);
        }
        else{
            System.out.println("does not contain " + profane1);
        }

        if(line_compare.contains(profane2)){
            System.out.println("does contain " + profane2);
        }
        else{
            System.out.println("does not contain " + profane2);
        }

        if(line_compare.contains(profane3)){
            System.out.println("does contain " + profane3);
        }
        else{
            System.out.println("does not contain " + profane3);
        }

        if((line_compare.contains(profane1)||line_compare.contains(profane2))||line_compare.contains(profane3)){
            System.out.println("This line would be consider profane.");
        }
        else{
            System.out.println("This line is clean.");
        }


    }
}

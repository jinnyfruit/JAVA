 /*
 file name: While Loop
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class WhileDemo {

    public static void main(String[] args){

        int count, number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        number = scanner.nextInt();

        count = 1;
        while(count <= number){

            System.out.print(count + ", ");
            count++;
        }
        System.out.println();
        System.out.println("Buckle my shoe.");
    }
 }

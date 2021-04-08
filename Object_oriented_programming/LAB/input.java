 /*
 file name: using for statment
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class input {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        int sum = 0;
        for(i = 1; i<=10; i++){
            System.out.println("Please enter a new number (" + i +" of 10): ");
            int input = scanner.nextInt();
            sum+=input;
        }
        System.out.println("Total sum is : " + sum);
    }
 }

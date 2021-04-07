/*
 file name: for loop - case study(1)
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Locale;
import java.util.Scanner;
public class For_loop {
    public static void main(String[] args){
        int i, sum=0,input;
        Scanner scanner = new Scanner(System.in);

        for(i=0;i<10;i++){
            System.out.println("type an integer:");
            input = scanner.nextInt();
            sum += input;
        }
        System.out.println("sum is " + sum);
    }
}

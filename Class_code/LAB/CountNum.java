/*
 file name: LAB 1-3
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class CountNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1,num2;

        System.out.println("type two integers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        int i = num2-num1+1;

        System.out.println("There are "+i+" integers between "+num1+" and "+num2);
    }
}

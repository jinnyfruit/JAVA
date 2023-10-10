/*
 file name: HW1-4
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class OctToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, temp, decimal_num = 0, value;
        System.out.println("Enter an octal value: ");
        String oct = scanner.next();    //get the string


        num = Integer.parseInt(oct);
        temp = num;

        value = num / 100;
        decimal_num += value * 64;
        num = num % 100;

        value = num / 10;
        decimal_num += value * 8;
        num = num % 10;

        value = num;
        decimal_num += value;


        System.out.print("Decimal equivalent of " + oct + " is ");
        System.out.println(decimal_num);
    }
}

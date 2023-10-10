/*
 file name: LAB 1-2
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class BirthYear {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("type your birth year:");

        int BYear = scanner.nextInt();
        int age = 2021 - BYear + 1;

        System.out.println("Your age is " + age);
    }
}

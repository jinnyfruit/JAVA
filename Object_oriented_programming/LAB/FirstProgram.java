/*
 file name: LAB 1-1
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class FirstProgram { //FirstProgram is name of the class
    public static void main (String[] args){
        System.out.println("Hello out there.");
        System.out.println("I will add two number for you.");
        System.out.println("Enter two whole numbers on a line:");

        int num1, num2;

        Scanner scann = new Scanner (System.in);    //with Scanner, we can get anything from the user
        num1 = scann.nextInt();
        num2 = scann.nextInt();

        System.out.println("The sum of those two numbers is");
        System.out.println(num1+num2);
    }
}

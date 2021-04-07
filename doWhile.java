/*
 file name: LAB 4-2 (loop practice)
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
        int cnt, num;

        System.out.println("type an integer");
        Scanner scann = new Scanner(System.in);

        num = scann.nextInt();
        cnt = 1;

        do{
            System.out.print(cnt+", ");
            cnt++;
        }while(cnt<=num);
        System.out.println();
        System.out.println(" buckle(s) exist.");
    }

}

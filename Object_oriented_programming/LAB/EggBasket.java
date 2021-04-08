/*
 file name: LAB 2-2
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class EggBasket {
    public static void main(String[] args){
        int num_of_baskets, eggsPerBasket, totalEggs;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type number of baskets:");
        num_of_baskets = scanner.nextInt();

        System.out.println("Type number of eggs per basket:");
        eggsPerBasket = scanner.nextInt();

        totalEggs = num_of_baskets * eggsPerBasket;

        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(num_of_baskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);
    }
}

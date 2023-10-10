/*
 file name: PurchaseDemo
 author: Ji woo Kim
 modified; 04.21, 2021
*/
import java.util.Scanner;
public class PurchaseDemo {
    public static void main(String[] args) {

        Purchase oneSale = new Purchase();
        oneSale.readInput();
        oneSale.readInput();

        System.out.println("Cost each $" + oneSale.getUnitCost());
        System.out.println("Total cost $" + oneSale.getTotalCost());

    }
}

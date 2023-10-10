/*
 file name: Purchasing program Demo
 author: Ji woo Kim
 modified: 05.24, 2021
*/
public class PurchaseDemo {
    public static void main(String[] args)
    {
        Purchase Oranges = new Purchase();
        Oranges.setName("Oranges");
        Oranges.readInput(10,2.99,24);
        Oranges.writeOutput();
        System.out.println("Total cost $" + Oranges.getTotalCost());

        Purchase Eggs = new Purchase();
        Eggs.setName("Eggs");
        Eggs.readInput(12,1.69,36);
        Eggs.writeOutput();
        System.out.println("Total cost $" + Eggs.getTotalCost());

        Purchase Apples = new Purchase();
        Apples.setName("Apples");
        Apples.readInput(3,1.00,20);
        Apples.writeOutput();
        System.out.println("Total cost $" + Apples.getTotalCost());

        Purchase Watermelons = new Purchase();
        Watermelons.setName("Watermelons");
        Watermelons.readInput(1,4.39,2);
        Watermelons.writeOutput();
        System.out.println("Total cost $" + Watermelons.getTotalCost());

        Purchase Bagels = new Purchase();
        Bagels.setName("Bagels");
        Bagels.readInput(6,3.50,12);
        Bagels.writeOutput();
        System.out.println("Total cost $" + Bagels.getTotalCost());
    }
}
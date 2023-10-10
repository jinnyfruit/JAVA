```java
/*
 file name: 3-2
 author: Ji woo Kim
 modified: 05.24, 2021
*/
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Purchase {

    private String name;
    private int groupCount;

    private double groupPrice;

    private int numberBought;

    public void setName(String newName){
        name = newName;
    }

    public void setPrice(int count, double costForCount){

        if((count<=0) || (costForCount <=0)){
            System.out.println("Error: Bad parameter in " + "setPrice.");
            System.exit(0);
        }
        else{
            groupCount = count;
            groupPrice = costForCount;
        }
    }

    public void SetNumberBought(int number){

        if(number <=0){
            System.out.println("Error: Bad parameter in " + "SetNumberBought");

            System.exit(0);
        }
        else{
            numberBought = number;
        }
    }

    public void readInput(int count, double price, int numbought){
        Scanner scanner = new Scanner(System.in);

        groupCount = count;
        groupPrice = price;

        while((groupCount <= 0) || (groupPrice <= 0)){

            System.out.println("Both numbers must " + "be positive. Try again.");
            System.out.println("Enter price of " + "item as two numbers.");
            System.out.println("For example, 3 for $2.99");
            System.out.println("3 2.99");
            System.out.println("Enter price of item as two numbers, now: ");

            groupCount = scanner.nextInt();
            groupPrice = scanner.nextDouble();
        }

        numberBought = numbought;

        while(numberBought <= 0){

            System.out.println("Number must be positive. " + " Try again");
            System.out.println("Enter number of items purchased: ");
            numberBought = scanner.nextInt();

        }
        System.out.println("groupCount: "+groupCount+" groupPrice: "+groupPrice+" numberBought: "+ numberBought);
    }

    public void writeOutput(){

        System.out.println(numberBought + " " + name);
        System.out.println("at " + groupCount + " for $ " + groupPrice);
    }

    public String getName(){
        return name;
    }

    public double getTotalCost(){
        return (groupPrice / groupCount) * numberBought;
    }

    public double getUnitCost(){
        return groupPrice / groupCount;
    }

    public int getNumberBought(){
        return numberBought;
    }

}
```
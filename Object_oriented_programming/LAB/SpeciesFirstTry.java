/*
 file name: Species Class
 author: Ji woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
public class SpeciesFirstTry {
    public String name;
    public int population;
    public double growthRate;

    public void readInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the species name? ");
        name = scanner.nextLine();
        System.out.println("What is the population of the species?");
        population = scanner.nextInt();
        System.out.println("Enter growth rate "+ "(% increase per year):");
        growthRate = scanner.nextDouble();
    }

    public void writeOutPut(){  

        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = "+ growthRate + "%");
    }

    public int getPopulationIn10(){

        int result = 0;
        double populationAmount = population;
        int count = 10;

        while ((count > 0) && (populationAmount > 0)){

          populationAmount = populationAmount + (growthRate / 100) * populationAmount;  

          count --;
        }
        if(populationAmount > 0){
            result = (int)populationAmount;
        }

        return result;
    }
}

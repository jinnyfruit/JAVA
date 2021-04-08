/*
 file name: Species Class
 author: Ji woo Kim
 modified; 04.08, 2021
*/
public class SpeciesFirstTryDemo {

    public static void main(String[] args){

        SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry();
        System.out.println("Enter data on the Species of "+"the Month");

        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutPut();;
        int futurePopulation = speciesOfTheMonth.getPopulationIn10();

        System.out.println("In ten years the population will be "+futurePopulation);

        speciesOfTheMonth.name = "Klingon ox";
        speciesOfTheMonth.population = 10;
        speciesOfTheMonth.growthRate = 15;
        System.out.println("The new Species of the Month: ");
        speciesOfTheMonth.writeOutPut();
        System.out.println(" In ten years the population will be " + speciesOfTheMonth.getPopulationIn10());
    }
}

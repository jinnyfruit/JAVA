/*
 file name: Pet
 author: Ji woo Kim
 modified; 05.01 , 2021
*/
import java.util.Scanner;
public class Pet {

    String name;
    int age;
    double weight;

    public Pet(String initialName, int initialAge, double initialWeight){

        name = initialName;

        if((initialAge < 0) || (initialWeight < 0)){

            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else{
            age = initialAge;
            weight = initialWeight;
        }
    }

    public void setPet(String newName, int newAge, double newWeight){
        name  = newName;

        if((newAge<0) || (newWeight < 0)){
            System.out.println("Error: Negative are or weight.");
            System.exit(0);
        }
    }

    public Pet (String initialName){

        name = initialName;
        age = 0;
        weight = 0;

    }

    public void setName(String newName){
        name = newName;
    }

    public Pet (int initialAge){
        name = "No name yet.";
        weight = 0;

        if(initialAge < 0){
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = initialAge;
    }

    public void setAge(int newAge){

        if(newAge < 0){
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = newAge;
    }

    public Pet(double initialWeight){

        name = "No name yet";
        age = 0;
        if(initialWeight < 0){
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = initialWeight;
    }

    public void setWeight(double newWeight){

        if(weight < 0 ){
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else{
            weight = newWeight;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return  weight;
    }

    public void writeOutput(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age+ "years");
        System.out.println("Weight: " + weight + "pounds");
    }
}

/*
 file name: Dog class test
 author: Ji Woo Kim
 modified; 04.05, 2021
*/
import java.util.Locale;
import java.util.Scanner;
public class Dog {
    public String name;
    public String breed;
    public int age;

    public void WriteOutput()
    {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age in calendar year: " + age);
        System.out.println("Age in human years: " + getAgeInHumanYear());
    }

    public int getAgeInHumanYear(){
        int humanAge = 0;

        if(age <= 2){
            humanAge = age * 11;
        }
        else{
            humanAge = 22 + ((age - 2) * 5);
        }
        return humanAge;
    }
}

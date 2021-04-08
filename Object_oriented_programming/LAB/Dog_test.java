 /*
 file name: Dog class test
 author: Ji Woo Kim
 modified; 04.05, 2021
*/
import java.util.Locale;
        import java.util.Scanner;
public class Dog_test {
    public static void main (String[] args){

        Dog cloud = new Dog();

        cloud.name = "Cloud";
        cloud.age = 3;
        cloud.breed = "Pomeranian";
        cloud.WriteOutput();
    }
}

/*
 file name: MotorBoat
 author: Ji woo Kim
 modified: 04.19, 2021
*/
import java.util.Scanner;
public class MotorBoat {
    double capacity;
    double amount;
    double max_speed;
    double cur_speed;
    double efficiency;

    public void Print_amount_of_fuel(double time){
        amount = efficiency * cur_speed * cur_speed * time;
        System.out.println("amount of fuel at the current speeds: " + amount );
    }
    public void Print_travel_distance(double time){
        double distance = cur_speed * time;
        System.out.println("travel distance: " + distance );
    }
    public void Print_distance_with_fuel_amount(){
        double distance = cur_speed * amount;
        System.out.println("with current fuel amount, travel distance is  " + distance );
    }
}

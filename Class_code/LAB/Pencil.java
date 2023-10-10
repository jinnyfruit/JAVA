/*
 file name: LAB 2-1
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Scanner;
public class Pencil {
    public String color = "white";
    public int length;
    public float diameter;
    private float price;
    public static long nextID =0;

   public void setPrice(float newPrice){
       price = newPrice;
   }
   public void printPrice(){
       System.out.print("Price of Pencil is ");
       System.out.println(price);
   }
}

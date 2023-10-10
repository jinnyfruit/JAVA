/*
 file name: HW1-2
 author: Ji Woo Kim
 modified; 03.29, 2021
*/
import java.util.Locale;
import java.util.Scanner;
public class String_Converter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = str.indexOf(" ");

        String head = str.substring(0,index);
        String tail = str.substring(index+1);
        String new_str = tail.substring(0,1).toUpperCase()+tail.substring(1)+" "+head;
        System.out.print(new_str);
    }
}

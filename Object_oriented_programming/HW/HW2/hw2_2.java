/*
 file name: 2-2
 author: Ji woo Kim
 modified; 04.19, 2021
*/
import java.util.Scanner;
public class hw2_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a data to be checked using mm/dd/yyyy format");
        String line = scanner.nextLine();

        String month, day, year;

        int index = line.indexOf('/');

        month = line.substring(0,index);
        day = line.substring(index+1,index+3);
        year = line.substring(index+4,index+8);

        System.out.println("date is " + month + " month " + day + " day " + year + " year");

        int month_int = Integer.parseInt(month);
        int day_int = Integer.parseInt(day);
        int year_int = Integer.parseInt(year);

        if(day_int > 31 || day_int<1){
            System.out.println("It is not a valid date");
            System.out.println("The reason it is invalid: The day value is not from 1 to 31");
        }

        if(month_int > 12 || month_int < 1){
            System.out.println("It is not a valid date");
            System.out.println("The reason it is invalid: The month value is not from 1 to 12");
        }

        if((year_int%400==0) && (month_int==2) && (day_int<1 || day_int>29)){
            System.out.println("It is not a valid date");
            System.out.println("The reason it is invalid: The day value is not from 1 to 29");
        }
        else if((year_int%400!=0) && (month_int==2) && (day_int<1 || day_int>28)){
            System.out.println("It is not a valid date");
            System.out.println("The reason it is invalid: The day value is not from 1 to 28");
        }

        if(month_int == 4 || month_int == 6 || month_int ==9 || month_int ==11){
            if(30 < day_int )
                System.out.println("The reason it is invalid: The day value is not from 1 to 30");
        }

    }
}

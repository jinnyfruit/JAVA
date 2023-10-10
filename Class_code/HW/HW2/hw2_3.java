/*
 file name: 2-3
 author: Ji woo Kim
 modified; 04.19, 2021
*/
import java.util.Scanner;
public class hw2_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum=0.0, max, min,avg;
        double[] temp = new double[7];
        System.out.println("type every temperature for 7 days:");

        int i;
        for(i=0;i<7;i++){
            temp[i] = scanner.nextDouble();
        }
        max = temp[0];
        min = temp[0];

        for(i=0;i<7;i++){

            sum += temp[i];

            if(min > temp[i])
                min = temp[i];
            if(max < temp[i])
                max = temp[i];

        }
        avg = sum / 7;

        System.out.println("Highest temperature is " + max);
        System.out.println("Lowest temperature is " + min);
        System.out.println("Average temperature is " + avg);
    }
}

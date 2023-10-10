 /*
 file name: Computes the average of a list of exam scores
 author: Ji Woo Kim
 modified; 04.08, 2021
*/
import java.util.Scanner;
 public class ExamAverager {

    public static void main(String[] args) {

        System.out.println("This program computes the average of");
        System.out.println("a list of (non-negative) exam scores.");

        double sum;
        int numberOfStudents;
        double next;
        String answer;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Enter all the scores to be averaged");
            System.out.println("Enter a negative number after");
            System.out.println("you have entered all the scores.");

            sum = 0;
            numberOfStudents = 0;
            next = scanner.nextDouble();

            while (next >= 0)
            {
                sum += next;
                numberOfStudents++;
                next = scanner.nextDouble();
            }

            if(numberOfStudents > 0)
                System.out.println("The average is "+ (sum/numberOfStudents));
            else
                System.out.println("No scores to average");

            System.out.println("Want to average another exam?");
            System.out.println("Enter yes or no.");
            answer = scanner.next();

        }while(answer.equalsIgnoreCase("yes")); //yes 인지 아닌지 검사 후 yes 이면 while문 반복복

    }
 }

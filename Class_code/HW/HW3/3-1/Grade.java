/*
 file name: 3-1
 author: Ji woo Kim
 modified: 05.24
*/
import java.util.Scanner;
public class Grade
{
    String name;
    double Quize_1;
    double Quize_2;
    double midterm;
    double finalexam;
    double numGrade;
    char letterGrade;

    public void readScore()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name: ");
        name = scanner.nextLine();

        System.out.println("Type your Quize_1 score(0~10): ");
        Quize_1 = scanner.nextInt();

        while(Quize_1>10 || Quize_1 < 0)
        {
            System.out.println("error: type again!!");
            System.out.println("Type your Quize_1 score(0~10): ");
            Quize_1 = scanner.nextDouble();
        }

        System.out.println("Type your Quize_2 score(0~10): ");
        Quize_2 = scanner.nextDouble();

        while(Quize_2>10 || Quize_2 < 0)
        {
            System.out.println("error: type again!!");
            System.out.println("Type your Quize_2 score(0~10): ");
            Quize_2 = scanner.nextDouble();
        }

        System.out.println("Type your Midterm score(0~100): ");
        midterm = scanner.nextDouble();

        while(midterm>100 || midterm < 0)
        {
            System.out.println("error: type again!!");
            System.out.println("Type your midterm score(0~100): ");
            midterm = scanner.nextDouble();
        }

        System.out.println("Type your final exam score(0~100): ");
        finalexam = scanner.nextDouble();

        while(finalexam>100 || finalexam < 0)
        {
            System.out.println("error: type again!!");
            System.out.println("Type your final exam score(0~100): ");
            finalexam = scanner.nextDouble();
        }
    }

    public void printRecord()
    {
        System.out.println("name: " + name);
        System.out.println("Quize_1 score(0-10): " + Quize_1);
        System.out.println("Quize_2 score(0-10) : " + Quize_2);
        System.out.println("midterm(0-100): " + midterm);
        System.out.println("finalexam(0-100): " + finalexam);
    }

    public double setNumGrade()
    {
        double Q1;
        double Q2;
        double mid;
        double fin;
        double numGrade = 0;

        Q1 = Quize_1 * 10;
        Q2 = Quize_2 * 10;
        numGrade += (Q1 + Q2)/2 * 0.25;

        mid = midterm * 0.25;
        fin = finalexam * 0.5;

        numGrade = numGrade + mid + fin;
        this.numGrade = numGrade;
        return this.numGrade;
    }


    public char setLetterGrade()
    {
        if(this.numGrade>=90)
            this.letterGrade = 'A';
        else if(this.numGrade<90 && this.numGrade>=80)
            this.letterGrade = 'B';
        else if(this.numGrade<80 && this.numGrade>=70)
            this.letterGrade = 'C';
        else if(this.numGrade<70 && this.numGrade>=60)
            this.letterGrade = 'D';
        else
            this.letterGrade = 'F';
        return this.letterGrade;
    }

    public static void main(String[] args)
    {
        Grade jinny = new Grade();
        jinny.readScore();
        jinny.printRecord();
        System.out.println("Numerical Grade: " + jinny.setNumGrade());
        System.out.println("Letter Grade: " + jinny.setLetterGrade());
    }
}
/*
 file name: 수학연산에서 발생하는 예외처리하기
 author: Ji woo Kim
 modified; 04.27, 2021
*/

/*
 * [수학 연산에서 발생하는 예외처리]
 * exception
 * 1) Runtime exception : 실행 시에 발생하는 예외 (잘못된 대입, 범위를 벗어난 경우, 0으로 나누기 등)
 * 2) Compiletime exception
 *
 * finally: 정상처리나 예외에 상관없이 실행되는 블록
*/
import java.util.Scanner;
public class FinallyTryCatch {
    public static void main(String[] args ){

        try{    //예외가 발생할 가능성이 이쓴ㄴ 부분이므로 try로 감싼다.
            //divide by zero
            int x = 5;
            int y = 20/(5-x);   //cast exception here!
        }
        catch (ArithmeticException e) {  //run time
            System.out.println("Check if it is divided into zero.");
        }
        finally {
            System.out.println("Must Be Done!");
        }
    }
}

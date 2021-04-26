/*
 file name: Format Try Catch
 author: Ji woo Kim
 modified; 04.27, 2021
*/

/*
 [Exception]
 예외가 발생할 수 있는 문장을 try{}에 넣는다.
 예외가 발생하면 catch(){}에서 처리하게 한다.
*/
import java.util.Scanner;
public class FormatTryCatch {
    public static void main(String[] args){

        String sNum = "1105";
        String nNum = "J";

        try{
            int a = Integer.parseInt(nNum);
            System.out.println(a);
        }
        catch (NumberFormatException ee){
            System.out.println("Check if it is integer.");
            System.err.println(ee.getMessage());
        }
        catch (Exception ee) {
            System.out.println("Hey, do it well.");
        }
        finally {
            System.out.println("Must be done!");
        }

    }
}
/*
*   NumberFormatException: 잘못된 타입을 변환할 때 발생
*   Exception: NumberFormatException의 예외가 발생할 경우
*/

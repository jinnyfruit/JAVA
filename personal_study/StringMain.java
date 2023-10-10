/*
 file name: String을 이용해 도시 이름 비교하기
 author: Ji woo Kim
 modified; 04.27, 2021
*/

/*
 * [About String]
 * string은 참조타입이지만 new 키워드를 사용하지 않고 생성할 수 있다.
 * primative type 처럼 쉽게 사용할 수 있도록 대입연산자(=)를 이용한다.
*/
import java.util.Scanner;
public class StringMain {
    public static void main(String[] args){

        String city1 = "Asia";
        String city2 = "Europe";
        String city3 = new String("Asia");  //new keyword를 이용함
        String city4 = "Asia";

        System.out.println(city1);
        System.out.println(city1.length());
        System.out.println(city1==city2);   //compare two city
        System.out.println(city1.equals(city2));
        System.out.println(city1==city3);
        System.out.println(city1==city4);
        System.out.println(city1.equals(city3));
        System.out.println(city1.equals(city4));

        String city5 = String.format("%s-%s", city1, city2);
        System.out.println(city5);
        String city6 = city1 + "-" + city2 + 1 + 2;
        System.out.println(city6);

    }
}

/*
 file name: Object 이해하고 사용하기
 author: Ji woo Kim
 modified; 04.27, 2021
*/

/*
 * [About Object]
 * 자바에서 최상위 클래스는 object
 * JVM의 메서드를 이용해 메모리를 관리함
 *
*/
import java.util.Scanner;
public class UsingObject {
    public static void main(String[] args){
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.hashCode());    //10진수
        System.out.println(Integer.toHexString(obj1.hashCode()));    //16진수
        System.out.println(obj1==obj2);     //객체의 고유성 확인
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1);
        System.out.println(obj2.toString()); //Class@hashCode

        System.out.println(obj1.getClass().getName());  //클래스 이름 구하기
        String str = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());    //16진수
        System.out.println(str);     //클래스 이름@16진수 해시코드

        Object objstr = new String("Good");     //다형성(Polymorphism)-> 부모의 이름으로 자식을 생성할 수 있다
        System.out.println(objstr.toString());
        System.out.println(objstr instanceof Object);
        System.out.println(objstr instanceof String);

        String hello = "hello";
        System.out.println(hello.getClass());

    }
}

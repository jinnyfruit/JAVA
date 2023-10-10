/*
 file name: Class를 이용해서 메서드와 생성자 살펴보기
 author: Ji woo Kim
 modified; 04.27, 2021
*/

/*
 * [About Object]
 * getClass() : Class를 반환한다.
 * Class: 해당 클래스의 선언된 메서드와 생성자들을 반환하는 메서드를 제공한다.
 * getDeclaredConstructos() : 선언한 생성자 반환
 * getMethods(): 선언된 메서드 제공
 *
 * -> Reflection: 모든 객체에 대한 객체 자신의 정보(생성자나 메서드) 등을 제공한다.
*/
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;
public class UsingClass {
    public static void main(String[] args){

        Object obj1 = new Object();
        Class classes = obj1.getClass();
        System.out.println(classes.getName());  //class 이름을 알 수 있다.

        System.out.println("----------constructor----------");
        Constructor[] constructor = classes.getDeclaredConstructors();

        for(Constructor con: constructor){
            System.out.println(con.getName());
        }
        System.out.println("----------Method----------");
        Method[] method = classes.getMethods();

        for(Method me : method){
            System.out.println(me.getName());
        }
    }
}

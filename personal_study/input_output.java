/*
file name: 메서드 선언하고 호출
author:jinnyfruit
modified: 01.15,2021
*/
import java.util.Scanner;   //입력과 출력 관련 class. (java util 패키지에 있다.)
/*
 * next() 메서드는 문자열을 입력받을 때 사용한다.
 * nextInt() 는 정수를 입력받을 때 사용한다.
 * nextDouble() 는 정수를 입력받을 때 사용한다.
 * 입력받으려는 타입과 next 타입이 맞지 않으면 NumberFormatException 이 발생한다. (타입을 주의하자)
 */
public class InOutMethod {
    public static void main(String[] args){
        Scanner scann=new Scanner(System.in);   //키보드를 통해 입력받기 위해 Scanner의 객체 scann을 생성한다.

        System.out.println("정수를 입력하세요");
        int choice=scann.nextInt(); //키보드로 정수 입력
        System.out.println(choice);

        System.out.println("실수를 입력하세요");
        double dchoice=scann.nextDouble();
        System.out.println(dchoice);

        System.out.println("문자열을 입력하세요");
        String schoice=scann.next();
        System.out.println(schoice);
    }
}



/*
file name: if조건문을 사용해서 짝/홀수 판별하기
author:jinnyfruit
modified: 01.22,2021
*/
import java.util.Scanner;   //입력,출력
public class EvenOddIfCondition {
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);

        System.out.println("정수를 입력하세요:");
        int num = scann.nextInt();  //정수 받기

        if(num==0){
            System.out.println(num+"은 0입니다.");
        }
        else if(num%2==0){
            System.out.println(num+"은 짝수 입니다.");
        }
        else {
            System.out.println(num + "은 홀수 입니다.");
        }
    }
}
/*
음수도 돌아가나 확인해봄 -> 정상 작동 
음수도 홀짝 따지는가? -> 따진다고 함
*/


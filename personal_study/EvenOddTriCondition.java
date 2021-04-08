/*
file name: 삼항연산자를 사용해서 짝/홀수 판별하기
author:jinnyfruit
modified: 01.22,2021
*/
import java.util.Scanner;   //입력,출력
public class EvenOddTriCondition {
    public static void main (String[] args){
        Scanner scann = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int num = scann.nextInt();

        if(num==0)
            System.out.println("0입니다");
        else {
            num = (num % 2 == 1) ? 1 : 0; //삼항연산자

            if (num == 1)
                System.out.println("홀수입니다");
            else if (num == 0)
                System.out.println("짝수입니다");
        }
    }
    
}



/*
file name: do while을 이용하여 1이 될 때까지 나누고 곱하기
author:jinnyfruit
modified: 01.26,2021
*/
/*
* do~while: 먼저 실행된 다음에 조건절이 실행되기 때문에 적어도 한번은 실행된다.
* while: 조건절이 먼저 실행되기 때문에 한번도 실행되지 않을 수도 있다. (조건이 명확할 때 사용)
*/
import java.util.Scanner;   //입출력
public class EvenOdd {
    public static void showOddnEvenw(int n){
     int temp=n;
     do {
         if(temp%2==1){     //홀수
             temp = temp*3+1;
         }
         else {
             temp/=2;
         }
         System.out.print("["+temp+"]");
     }
     while(temp!=1);
            System.out.println("\n--------------------");
     }
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        System.out.println("type an integer");
        int num = scann.nextInt();
        showOddnEvenw(num);
    }
}
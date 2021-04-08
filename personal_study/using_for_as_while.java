/*
file name: using for as while
author:jinnyfruit
modified: 01.26,2021
*/
/*
* for문 구조  : for( 초기값; 조건; 스텝) {바디}
* 이때 초기값, 조건, 스텝을 모두 제거하고 for( ; true ; ){} == while(true) while문처럼 쓸 수 있다.(굳이...?)
*/
import java.util.Scanner;   //입출력
public class EvenOdd {
    public static void showOddnEvenw(int n) {
        int temp = n;
        for(; temp!=1;){
            if(temp%2==1){      //홀수
                temp=temp*3+1;
            }
            else{   //짝수
                temp/=2;
            }
            System.out.print("["+temp+"]");
        }
        System.out.println("\n--------------------------");
    }
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        System.out.println("type an integer");
        int num = scann.nextInt();
        showOddnEvenw(num);
    }
}
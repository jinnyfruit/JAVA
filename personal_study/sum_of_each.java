/*
file name: while과 단축 연산자를 이용하여 각 자릿수의 합 구하기
author:jinnyfruit
modified: 01.26,2021
*/
import java.util.Scanner;   //입출력
public class Contraction {
    public static int sumEach(int n){
        int tot=0;
        while(n!=0){
            tot+=n%10;  //3->2->1
            n/=10;
        }
        return tot;
    }
    public static void main(String[] args){

        Scanner scann = new Scanner(System.in);
        System.out.println("type an integer:");
        int num = scann.nextInt();

        int value = sumEach(num);
        System.out.printf("%d에 대한 각 자리의 숫자 합:%d", num, value);
    }
}
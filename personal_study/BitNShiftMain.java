/*
file name: Shift 연산자를 이용하여 2진수 문자열로 바꾸기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.Scanner;   //입출력

public class BitShiftMain {
    //10진수 정수를 2진수 문자열(String)으로 변환
    public static String shifts(int num) {
        String s = "";  //initialization

        for(int i=0; i<=31; i++){
            int temp=num%2;
            s = (temp>=0)? temp+s :(-temp)+s;
            num>>=1;    //same as a=a/2
        }
        return s;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("type an integer:");
        int num1 = scanner.nextInt();
        System.out.printf("%d:%s\n",num1,shifts(num1));

        System.out.println("type an integer:");
        int num2 = scanner.nextInt();
        System.out.printf("%d:%s\n",num2,shifts(num2));
    }
}
/*
file name: &(비트) 연산자를 이용하여 2진수 문자열로 바꾸기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.Scanner;   //입출력

public class BitShiftMain {
    //10진수 정수를 2진수 문자열(String)으로 변환
    public static String shift(int num){
        int BITMASK=1;
        String s="";    //initialization
        for(int i=0;i<=31;i++){
            s=(num&BITMASK)+s;
            num>>=1;    //same as a/=2
        }
        return s;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("type an integer:");
        int num1 = scanner.nextInt();   //get an integer from user
        System.out.printf("%d : %s\n",num1,shift(num1));

        System.out.println("type an integer:");
        int num2 = scanner.nextInt();
        System.out.printf("%d : %s\n",num2,shift(num2));
    }
}
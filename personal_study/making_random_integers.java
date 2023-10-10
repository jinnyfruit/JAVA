/*
file name: while을 이용하여 서로 다른 세 정수 만들기
author:jinnyfruit
modified: 01.26,2021
*/
/*
* 임의의 정수 생성하는 법
* (int) (num*Math.random( )+1) 은 1과 num 사이의 임의의 정수를 반환한다.
*/
import java.util.Scanner;   //입출력
public class BioRandom {
    public static void main(String[] args){
        int range = 10;
        int start = 1;
        int a = 0, b = 0, c = 0;
        while(true){
            a = (int)(range*Math.random()+start);   //get three random integers from Math.random()
            b = (int)(range*Math.random()+start);
            c = (int)(range*Math.random()+start);
            if(a!=b && b!=c && c!=a)    // if all three are not the same, break!
                break;
        }
        System.out.printf("%d\t%d\t%d",a,b,c);      //print three random integers.
    }
}




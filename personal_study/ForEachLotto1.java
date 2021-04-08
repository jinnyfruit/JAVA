/*
file name: varargs(variable arguments)를 이용하여 배열 출력하기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.Scanner;   //입출력

/*
*   가변인자(varargs, variable arguments)는 아규먼트의 개수가 몇개라도 배열처럼 사용할 수 있다.
*   ->변수의 타입이 같을 때 한 개 이상의 변수를 배열처럼 받아서 사용할 수 있다. (...이용)
*/
public class ForEachLotto {
    public static void print(int ...var){
        for(int i : var){
            System.out.printf(i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr);
        int jinny=1105;
        int Hun=1223;
        int LJLee=0117;
        print(jinny);   
    
        print(jinny,Hun);   
        print(jinny,Hun,LJLee);    
    }
}
/*
file name: 향상된 for(foreach)로 배열 출력하기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.Scanner;   //입출력

/*
*   향상된 for는 배열이나 리스트를 index로 굳이 지정하지 않아도 되므로 출력할 때 편리.
*   : 뒤에는 주로 배열이나 리스틑가 오고
*   : 앞에는 타입을 사용한다.
*/
public class ForEachLotto {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};  //1차원 배열, 선언과 함께 초기화
        for(int i : arr){
            System.out.printf(i+"\t");
        }
        System.out.println();
    }
}
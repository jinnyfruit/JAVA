/*
file name: 정수-실수 변환으로 섭씨를 화씨로 바꾸기
author:jinnyfruit
modified: 01.26,2021
*/
import java.util.Scanner;   //입출력
public class Temperature {
   public static void main(String[] args){
       Scanner scann = new Scanner(System.in);
       System.out.println("화씨로 바꿀 섭씨를 입력하세요:");
       int num = scann.nextInt();

       for(int i=0;i<num+1;i++){
            double fahrenheit = 9.0/5*i+32;
            System.out.printf("섭씨 %d도 = 화씨 %.2f도 \n",i,fahrenheit);
       }
   }
}
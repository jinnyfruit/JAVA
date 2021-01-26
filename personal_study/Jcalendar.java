/*
file name: 논리 연산자(&&,||) 로 윤년 판별하기
author:jinnyfruit
modified: 01.26,2021
*/
import java.util.Scanner;   //입출력
public class Jcalendar {
    public boolean isLeapYear(int year){    //member method 이므로 new 예약어를 이용해 객체를 생성해야 한다.
        boolean isS = false;
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            isS = true;
        }
        return isS;
    }
    public static void main(String[] args){
        
        Scanner scann = new Scanner(System.in);     
        int year = scann.nextInt();     // get integer from user
        Jcalendar hc = new Jcalendar();      // make a Jcalendar object, hc
        System.out.println(hc.isLeapYear(year)); 
    }
}
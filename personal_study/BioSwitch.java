/*
file name: 입력받은 정수값에 따라 신체,감정,지성값 출력하기
author:jinnyfruit
modified: 01.22,2021
*/
import java.util.Scanner;   //입력,출력
public class BioSwitch {
    //조건에 따라 신체,감정,지성값을 출력
    public static String textInfor( int index, double value){
        String result = "";
        switch (index) {
            case 23:
                result = "신체 지수:";
                break;
            case 28:
                result = "감정지수:";
                break;
            case 33:
                result = "지성 지수:";
                break;
        }
        return result + (value * 100);
    }
    public static void main (String[] args){

        Scanner scann = new Scanner(System.in);

        System.out.println("인덱스 값을 입력하세요 (23:신체지수, 28:감정지수, 33:지성지수)");
        int  index = scann.nextInt();
        System.out.println("검사수치를 입력하세요");
        double value = scann.nextDouble();
        String Result = textInfor( index, value);
        System.out.println(Result);
    }
}



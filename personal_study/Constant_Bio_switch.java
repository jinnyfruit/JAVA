/*
file name: 상수값에 따라 신체,감정,지성값 추력하기
author:jinnyfruit
modified: 01.22,2021
*/
import java.util.Scanner;   //입력,출력
public class BioSwitch {
    //상수 -> 값이 한번 결정되었기 때문에 변경할 수 없다. static final 키워드를 사용해 선언하고, 대문자를 사용한다.
    public static final int PHYSICAL = 23;
    public static final int EMOTIONAL = 28;
    public static final int INTELLECTUAL = 33;

    public static String textInfor( int index, double value){
        String result = "";
        switch (index) {
            case PHYSICAL:
                result = "신체 지수:";
                break;
            case EMOTIONAL:
                result = "감정지수:";
                break;
            case INTELLECTUAL:
                result = "지성 지수:";
                break;
        }
        return result + (value * 100);
    }
    public static void main (String[] args){

        Scanner scann = new Scanner(System.in);

        System.out.println("인덱스 값을 입력하세요 (23:신체지수, 28:감정지수, 33:지성지수):");
        int  index = scann.nextInt();
        System.out.println("검사수치를 입력하세요:");
        double value = scann.nextDouble();
        String Result = textInfor( index, value);
        System.out.println(Result);
    }
}



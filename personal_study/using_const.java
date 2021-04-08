/*
file name: 상수 사용하기
author:jinnyfruit
modified: 01.15,2021
*/
public class BioCalendar {
    public static final int PHYSICAL = 23;  //상수(개발자 정의)
    /*
    * public static final 예약어를 붙여 상수를 선언한다. 상수는 "대문자"를 쓴다.
    */
    public static void main(String[] args){
        System.out.println(PHYSICAL);
        int index=PHYSICAL; //상수를 변수에 대입할 수 있다.
        double vals =2*Math.PI/index;
        //Math.PI는 Math 클래스에 public final double PI=3.14 로 선언되어 있다.
        System.out.println(vals+"라디안");
    }
}

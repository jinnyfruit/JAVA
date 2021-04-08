/*
file name: Math 클래스를 사용하여 신체 지수 구하기
author:jinnyfruit
modified: 01.15,2021
*/
public class BioCalendar {
    public static final int PHYSICAL = 23;  //상수(개발자 정의), 상수값은 변경이 불가하다.
    public static void main(String[] args){
        int index=PHYSICAL; //상수를 변수에 대입할 수 있다.
        int days=1200;
        double phyval=100*Math.sin((days%index)*2*Math.PI/index);
        System.out.printf("나의 신체 지수는 %1$.2f입니다.\n",phyval);
    }
}

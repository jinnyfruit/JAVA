/*
file name: static 메서드를 이용해서 신체 지수 구하기
author:jinnyfruit
modified: 01.15,2021
*/

/*
* static 메서드는 static 예약어가 붙어있다. 
* 객체 생성 없이 호출할 수 있다. 
*/

public class BioCalendar {
   //상수값은 변경할 수 없다.
    public static final int PHYSICAL=23;
    //static 메서드 선언
    public static double getBioRhythm(long days,int index,int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }
    public static void main(String[] args){
        int days=1200;
        //메서드 호출
        double phyval=getBioRhythm(days,PHYSICAL,100);
        System.out.printf("나의 신체 지수 %.2f 입니다.\n",phyval);
    }
}

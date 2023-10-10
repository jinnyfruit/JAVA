/*
file name: 연산자를 이용하여 바이오리듬 값 구하기
author:jinnyfruit
modified: 01.15,2021
*/
public class BioCalendar {
    public static final int PHYSICAL = 23;  //상수(개발자 정의), 상수값은 변경이 불가하다.
    /*
    * public static final 예약어를 붙여 상수를 선언한다. 상수는 "대문자"를 쓴다.
    */
    public static void main(String[] args){
        int index=PHYSICAL; //상수를 변수에 대입할 수 있다.
        int days=1200;
        double vals = (days%index)*2*Math.PI/index;
        System.out.println(Math.toDegrees(vals)+"도");
        /*
        * 연산할 떄 double과 int 타입이 같이 있으면 결과값은 자동으로 double이 된다.  
        */
    }
}

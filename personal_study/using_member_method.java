/*
file name: member 메서드를 이용해서 신체 지수 구하기
author:jinnyfruit
modified: 01.16,2021
*/

/*
* member method(non-static method) <=> static method
* new 예약어를 이용해 객체 생성
* static method와 달리 객체를 생성해야만 한다.
*/
public class BioCalendar {
   //상수,상수값은 변경할 수 없다.
    public static final int PHYSICAL=23;
    //멤버 메서드(non static 선언)
    public double getBioRhythm(long days,int index,int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }
    public static void main (String[] args){
        int days=1200;
        BioCalendar bio = new BioCalendar();    //객체 생성
        double phyval = bio.getBioRhythm(days,PHYSICAL,100);
        System.out.printf("나의 신체지수는 %1$.2f입니다.\n",phyval);
    }
}

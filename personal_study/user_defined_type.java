/*
file name: 사용자 정의 참조 타입 사용하기
author:jinnyfruit
modified: 01.14,2021
*/
//사용자 정의 참조 타입은 사용자가 선언한 클래스이다.
//선언 방법은 public class 클래스이름 {}
class Location{
    public double lat;
    public double lng;
}
public class User_defined_type {
    public static void main(String[] args){
        //기본 타입
        double latitude=37.52127220511242;
        double longitude=127.0044462890625;

        //사용자 정의 객체를 새로 생성한다.
        Location loc= new Location();
        loc.lat=latitude;   //해당하는 값을 대입한다.
        loc.lng=longitude;

        Location newloc=loc;    //또 다른 사용자 정의 객체에 객체를 대입한다.
        System.out.println(newloc.lat); //값을 출력하여 확인한다.
        System.out.println(newloc.lng);
    }
}

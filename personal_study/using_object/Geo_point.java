/*
file name: 객체를 이용하여 위도,경도 표현하기(동적으로 할당)
author:jinnyfruit
modified: 01.20,2021
*/
/*
* [객체 생성하는 법]
*  클래스이름 레퍼런스 = new 클래스이름();
*  ex) NODE node = new NODE();
*
*  ->new 예약어는 클래스에서 선언한 대로 힙(Heap)메모리에 올려 사용할 수 있는 객체를 생성한다.
*  ->클래스는 설계도, 객체는 아파트이다.
*/
public class GeoPoint {
    public static void main(String[] args){

        double latitude1 = 37.52127220511242;     //서울 위도,경도
        double longitude1 = 127.0074462890625;
        double latitude2 = 35.137879119634185;     //부산 위도,경도
        double longitude2 = 129.04541018625;
        System.out.println("[일반 변수대입]");
        System.out.println("서울:"+latitude1+"\t"+longitude1);
        System.out.println("부산:"+latitude2+"\t"+longitude2);

        Geo geo1 = new Geo();     //(위도,경도) 객체 생성
        geo1.latitude = latitude1;
        geo1.longitude = longitude1;
        System.out.println("[객체 생성]");
        System.out.println("서울:"+geo1.latitude+"\t"+geo1.longitude);

        Geo geo2 = new Geo();
        geo2.latitude = latitude2;
        geo2.longitude = longitude2;

        //객체를 또다른 객체에 전달할 수 있다. 그러면 객체의 속성까지 그대로 전달된다.
        Geo geo=geo2;
        System.out.println("부산:"+geo2.latitude+"\t"+geo2.longitude);
        System.out.println("[객체전달]");
        System.out.println("부산:"+geo.latitude+"\t"+geo.longitude);
    }
}



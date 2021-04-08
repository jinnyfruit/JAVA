/*
file name: 1,2-dimensional array
author:jinnyfruit
modified: 01.20,2021
*/
public class geoPoint {
    public static void main(String[] args){

        double latitude1=37.52127220511242;     //서울 위도,경도
        double longitude1=127.0074462890625;
        double latitude2=35.137879119634185;     //부산 위도,경도
        double longitude2=129.04541018625;
        System.out.println("[일반 변수대입]");
        System.out.println("서울:"+latitude1+"\t"+longitude1);
        System.out.println("부산:"+latitude2+"\t"+longitude2);

        //1차원 배열
        double[] latlng1={latitude1,longitude1};
        double[] latlng2={latitude2,longitude2};
        System.out.println("[1차원 배열]");
        System.out.println("서울:"+latlng1[0]+"\t"+latlng1[1]);
        System.out.println("부산:"+latlng2[0]+"\t"+latlng2[1]);

        //2차원 배열
        double[][]latlng={{latitude1,longitude1},
                          {latitude2,longitude2}};
        System.out.println("[2차원 배열]");
        System.out.println("서울:"+latlng[0][0]+"\t"+latlng[0][1]);
        System.out.println("부산:"+latlng[1][0]+"\t"+latlng[1][1]);
    }
}



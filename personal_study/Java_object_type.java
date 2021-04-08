/*
file name: API에서 제공하는 참조타입 사용하기
author:jinnyfruit
modified: 01.12,2021
*/
//참조 타입
import java.util.Calendar;  //Calendar의 소속은 util 이다.
import java.util.Date;  //Date의 소속은 util 이다.
public class Java_object_type {
    public static void main(String[] args){
        //배열을 이렇게 두가지 방법으로 정의할 수 있다.
        int[] nums1={1,2,3}; //크기가 이미 정해져서 다시 초기화할 수 없다.
        int [] nums2=new int[] {1,2,3}; //new키워드를 이용해서 동적할당으로 배열을 초기화한다.

        String ID="jinnyfruit";
        Date d=new Date();
        Calendar cal=Calendar.getInstance();

        System.out.println(nums1[0]);
        System.out.println(ID);
        System.out.println(d);
        System.out.println(cal);
    }
}

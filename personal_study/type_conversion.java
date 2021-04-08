/*
file name: 문자열 실수로 변환하기
author:jinnyfruit
modified: 01.14,2021
*/
public class TypeConversion {
       public static void main(String[] args){
           String line="3.141592  ";    //문자열에 공백이 포함되어 있다.

           double py= Double.parseDouble(line.trim());
           /*
           trim() 은 양쪽 공백을 제거하여 3.141592
           Double 랩퍼 클래스를 이용하여 타입 변환 한다.
           */
           System.out.println(py);
       }
}

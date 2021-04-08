/*
file name: While과 조건을 이용하여 서로 다른 세 정수 만들기
author:jinnyfruit
modified: 03.09, 2021
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Random
public class BioRandom {
  public static void main(String[] args){
    int range = 10;
    int start = 1;
    int a=0, b=0, c=0;

    while(a==b||b==c||c==a){  //if all three integers are different
      a = (int)(range*Math.random()+start);
      b = (int)(range*Math.random()+start);
      c = (int)(range*Math.random()+start);
    }
    System.out.printf("%d\t%d\t%d",a,b,c);
  }
}
/*
file name: for와 if를 이용하여 홀수에 대한 제곱의 합 구하기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//List
public class ForCondition2 {
  public static void main(String[] args){
      List<Integer> ilist = new ArrayList<>();
      int sum=0;
      Scanner scanner = new Scanner(System.in);

      System.out.println("type an integer:");
      int num = scanner.nextInt();

      for(int i=1;i<=num;i++){
          ilist.add(i);
      }
      for(int i : ilist){
          if(i%2==1){
              sum+=i*i;
              System.out.printf("%d\t",i*i);
          }
      }
      System.out.println();
      System.out.println("0~%d 사이의 홀수에 대한 제곱합:"+sum);
  }
}
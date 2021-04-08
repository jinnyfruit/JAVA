/*
file name: foreach와 Lambda 형식을 이용하여 List 출력하기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.function.Consumer;

/*
* {} (람다)형식 이용하기
* foreach에서 순서대로 수를 가져와 출력하려면 forEach( var -> {var 출력}) 형식을 이용한다.
*/

public class ForeachLambda {
  public static void main(String[] args){
      List<Integer> lists = Arrays.asList(1,2,3,4,5);

      lists.forEach(
              i -> {System.out.printf(i+"\t");}     //lists에 저장되어 있는 정수를 한 개씩 가져와 출력
      );
      System.out.println();
      Consumer<Integer>consume = (Integer i) -> { System.out.printf(i+"\t");};
      lists.forEach(consume);
  }
}
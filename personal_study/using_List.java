/*
file name: 배열보다 편리한 LIST 사용하기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.ArrayList;
import java.util.Scanner;   //입출력
import java.util.List;

/*
*   List: 배열과 같은 역할을 하면서 더 편리한 메소드를 제공한다.
*   ->배열은 저장하는 data수가 제한되어 있으므로 정해진 개수 이상 저장할 수 없다.
*   ->List는 저장공간을 스스로 확보하면서 데이터를 저장한다.
*/
public class list {
   public static void main (String[] args){
     List<Integer> ilist=new ArrayList<>();
     //넣기
       for(int i =1;i<=10;i++){
            ilist.add(i);   //List에 입력할 때는 add를 사용한다.
       }
     //가져오기
       for(int i=0;i<ilist.size();i++) {
           int temp = ilist.get(i);     //List에서 가져올 때는 get을 사용한다.
           System.out.printf("%d\t", temp);
       }
       System.out.println();
   }
}
/*
file name: real number array
author:jinnyfruit
modified: 01.14,2021
*/
public class Grade {
      public static void main(String[] arg){
          double[] grade={4.0,4.0,4.0};
          double total=0;
          int i;
          for(i=0;i<3;i++){
              total+=grade[i];
          }
          double avg=total/3;
          System.out.printf("소구패 %.2f\t로공 %.2f\t기리십 %.2f\n",grade[0],grade[1],grade[2]);
          System.out.printf("평균 %.2f",avg);
      }
}

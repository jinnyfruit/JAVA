/*
file name: compare char and string
author:jinnyfruit
modified: 01.14,2021
*/
public class Grade {
      public static void main(String[] arg){
          double SWD=4.0;
          double Rob=4.0;
          double BAL=4.0;
          double total=SWD+Rob+BAL;
          double avg=total/3;
          System.out.printf("소구패 %.2f\t로공 %.2f\t기리십 %.2f",SWD,Rob,BAL);
          System.out.printf("평균 %.2f",avg);
      }
}

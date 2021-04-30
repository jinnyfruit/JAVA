/*
 file name: 수학 관련 메서드 사용하기
 author: Ji woo Kim
 modified; 05.01 , 2021
*/
import java.util.Scanner;
public class MathTestMain {

    public static void main(String[] args){
        //constant
        System.out.println("Math.E" + Math.E);
        System.out.println("Math.PI" + Math.PI);

        //method
        System.out.println("Math.abs(-5) 절대값 : " + Math.abs(-5));
        System.out.println("Math.ceil(4.34) 올림 : " + Math.ceil(4.34));
        System.out.println("Math.round(4.34) 반올림 : " + Math.round(4.34));   //round 는 0.5부터 반올림이 됨
        System.out.println("Math.floor(4.34) 버림 : " + Math.floor(4.34));
        System.out.println("Math.rint(4.51) 반올림 : " + Math.rint(4.51));     //rint는 0.5초과 부터 반올림이 된다.
        System.out.println();

        System.out.println("Math.max(45,78): "+Math.max(45,78));
        System.out.println("Math.min(45,78): "+Math.min(45,78));
        System.out.println("Math.pow(2,4): "+Math.pow(2,4));
        System.out.println("Math.log(30): "+Math.log(30));
        System.out.println("Math.exp(3): "+Math.exp(3));

        //random
        double dRan = Math.random();
        System.out.println("Math.random() =>" + dRan);

    }


}

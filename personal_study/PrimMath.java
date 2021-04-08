/*
file name: 제곱근을 이용하여 소수 판별하기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.Scanner;   //입출력
/*
*   소수(prime number): 1과 자기 자신으로만 나누어 떨어지는 수
*   여러 소수 계산법 중 반복횟수를 최소화한 방법이 제곱근을 이용하는 것이다.
*/
public class PrimMath {
    public static boolean isPrime(int n){
     boolean isS = true;

     for(int i=2;i<=(int)Math.sqrt(n);i++){
         if(n%i==0){
             isS=false;
             break;
         }
     }
     return isS;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("type an integer:");
        int num = scanner.nextInt();

        boolean ifPrime = isPrime(num);     //check if it is prime number

        if(ifPrime){
            System.out.printf("%는 1과 자신으로만 나누어 떨어지는 소수다.",num);
        }
        else {
            System.out.printf("%d은 소수가 아니다.",num);
        }
    }
}
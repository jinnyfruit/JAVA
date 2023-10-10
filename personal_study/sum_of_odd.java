/*
file name: for와 if를 이용하여 홀수의 합 구하기
author:jinnyfruit
modified: 01.29,2021
*/
import java.util.Scanner;   //입출력

public class ForCondition {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("type an integer you wanna add:");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        System.out.printf("0~%d 사이의 홀수합: %d\n", num, sum);
    }
}
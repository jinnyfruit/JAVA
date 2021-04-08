/*
file name: switch~ case 로 카드값 구하기
author:jinnyfruit
modified: 01.23,2021
*/
public class SwitchCondition {
    public static int toNum(char c){
        int tot = 0;
        switch (c){
            case 'A':
                tot=1; break;
            case 'T':
                tot=10; break;
            case 'J':
                tot=11; break;
            case 'Q':
                tot= 12; break;
            case 'K':
                tot= 13; break;
            default:
                tot=c-'0'; break;
        }
        return tot;
    }
    public static void main(String[] args){
        char c='J';
        int result = toNum(c);  //메서드 toNum의 파라미터로 c를 넣는다.
        System.out.printf("%c => %d \n",c,result);     //결과값 출력
    }
}
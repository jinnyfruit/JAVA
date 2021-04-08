/*
file name: enum값에 따라 신체,감정,지성값 추력하기
author:jinnyfruit
modified: 01.22,2021
*/
public class BioSwitch {
    //상수 -> 값이 한번 결정되었기 때문에 변경할 수 없다. static final 키워드를 사용해 선언하고, 대문자를 사용한다.
    public static final int PHYSICAL = 23;
    public static final int EMOTIONAL = 28;
    public static final int INTELLECTUAL = 33;

    public static String textInfor( PEI index, double value){
        String result = "";
        switch (index) {
            case PHYSICAL:
                result = "신체 지수:";
                break;
            case EMOTIONAL:
                result = "감정지수:";
                break;
            case INTELLECTUAL:
                result = "지성 지수:";
                break;
            default:
                result = "미결정:";
                break;
        }
        return result + (value * 100);
    }
    public static void main (String[] args){
        PEI index = PEI.PHYSICAL;
        double value = 0.86;
        System.out.println("신체 지수 주기값:"+index.getPei());    //해당 enum값 출력
        String st = textInfor(index, value);
        System.out.println(index.ordinal());    //enum의 순서를 출력하는 메소드
        System.out.println(index.name());   //이름이 출력된다.
        System.out.println(index);
        System.out.println(index.getPei());     //문자열 반환
    }
}



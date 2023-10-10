/*
file name: enum_practice
author:jinnyfruit
modified: 01.19,2021
*/
public class FruitMain {
    public static void main(String[] args) {
        FRUIT pear =FRUIT.APPLE;    //FRUIT 타입의 변수 pear에 enum 값을 대입한다.
        FRUIT pear2 =FRUIT.MANGO;
        System.out.println(pear);
        System.out.println(pear.name());     //name() -> 호출된 값의 이름을 string으로 호출
        System.out.println(pear.ordinal());     //ordinal() -> 해당 값이 enum에 정의된 순서를 리턴한다.
        System.out.println(pear2.ordinal());
        FRUIT[] fruits=FRUIT.values();
        System.out.println(fruits[0]);
    }

}
/*
file name: enum값에 따라 신체,감정,지성값 추력하기
author:jinnyfruit
modified: 01.22,2021
*/public enum PEI {
    //23,28,33을 생성자를 통해 enum 값으로 초기화 -> 더이상 값을 변경할 수 없다.
    PHYSICAL(23),EMOTIONAL(28),INTELLECTUAL(33);
    private final int peiValue;     //PEI에 있는 모든 상수값을 이 enum 변수를 통해 저장할 수 있다.

    PEI(int pie){   //enum 값을 초기화할 수 있는 생성자이다.
        this.peiValue=pie;
    }
    public int getPei(){
        return peiValue;
    }
}
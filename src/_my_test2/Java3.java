package _my_test2;

public class Java3 {
    /**
     * 객체란?
     * 속성과 행동을 가지며 각각 객체의 상태와 객체가 수행할 수 있는 작업을 나타낸다.
     * 객체의 속성 - 특성, 상태, 데이터를 의미함
     * 객체의 행동 - 수행할 수 있는 작업이나 기능
     */
    /**
     * 클래스란?
     * 객체를 생성하기 위한 템플릿 (설계도)
     * 객체의 상태를 나타내는 필드(변수)와 객체의 행동을 정의하는 메서드(함수)로 구성
     */

    // JVM 가상 메모리 공간
    // stack 메모리 공간과 Heap 동적 메모리 공간이 존재한다.

    // 클래스 설계하는 측
    int hp;
    int dp;
    double weight;
    boolean isDie;
    String name;

    public static void main(String[] args) {
        // 코드를 실행하는 측
        Java3 j1 = new Java3();
        j1.hp = 10;
        j1.dp = 20;
        j1.isDie = false;
        j1.name = "아리";
        System.out.println(j1.name);
        System.out.println(j1.hp);
        // 멤버 변수를 초기화 하지 않으면 인스턴스화 될 때 기본값으로 초기화된다.
        System.out.println(j1.weight); // 0.0

        // Java3 j1 = new Java3();
        // int j = 10;
        // System.out.println(j1); // 주소값
        // System.out.println(j); // 정수값
    }
}

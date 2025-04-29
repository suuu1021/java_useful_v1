package _my_test2;

public class Java4 {
    /**
     * 함수란?
     * 프로그래밍에서 특정 작업을 수행하는 코드의 집합으로
     * 입력을 받아 처리 후 결과를 반환할 수 있습니다.
     * 코드의 재사용성을 높이고 프로그램의 구조를 체계적으로 관리할 수 있게 도와줍니다.
     * 구현된 함수는 호출하여 사용하고 호출된 함수는 기능이 끝나면 실행의 제어가 반환된다.
     */

    // 함수 설계
    // 반환될 데이터 타입 + 이름 (매개 변수) {함수의 바디}
    static int add(int n1, int n2) {
        int result; // 함수 안에 선언하는 변수 지역 변수 <-> 클래스 바로 아래 쓰는 변수 멤버 변수
        result = n1 + n2;
        return result;
    }

    // 리턴 타입 void - 반환값이 없다. return 키워드 사용하지 않아도 된다.
    static void sayHello(int age) {
        System.out.println("안녕 내 나이는 " + age + " 이야");
    }

    // 수의 부호 판별
    static String signOfNumber(int a) {
        if (a == 0) {
            return "ZERO";
        } else if (a > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    // 나이 확인
    static boolean checkAdult(int age) {
        boolean result = (age >= 18);
        return result;
    }

    // 최대값 찾기
    static int findMax(int n1, int n2) {
        int result2 = (n1 > n2) ? n1 : n2;
        return result2;
    }

    // 코드실행
    public static void main(String[] args) {
        int sub1 = add(100, 50);
        System.out.println(sub1);
    }


}

package _my_test1;

public class Java2 {

    public static void main(String[] args) {
        // 조건문 if
        // if (조건식) {
        // 수행문;
        // }
        // if(조건식) {
        // 수행문1;
        // } else {
        // 수행문2;
        // }
        int age = 5;
        int height = 130;
        if (age > 10) {
            if (height > 120) {
                System.out.println("나이는 되지만 키가 부족해서 탑승할 수 없습니다");
            }
        } else {
            System.out.println("나이가 어려서 탑승할 수 없습니다");
        }

        // 반복문 for
        // for(초기화식; 조건식; 증감식) {
        //    수행문
        // }
        // 0부터 9까지 화면 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("i : " + i);
        }
        // 구구단 출력
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
        System.out.println("-----------------------");
        // 짝수만 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 1 ~ 10까지 숫자 중 짝수만 모두 더한 값을 출력
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                a = a + i;
            }
        }
        System.out.println(a);

        // 반복문 while
        // while (조건식) {
        //    수행문;
        // }
        int i = 0;
        while (i < 10) {
            System.out.println("i : " + i);
            i++;
        }
        System.out.println("----------------------");

        // break, continue
        for (int j = 1; j < 10; j++) {
            System.out.println("j : " + j);
            if (j % 5 == 0) {
                break;
            }
        }

        int ball = 1;
        while (ball < 10) {
            if (ball % 4 == 0) {
                break;
            }
            ball++;
        }
        System.out.println(ball);
        // 2의 배수만 출력
        for (int f = 1; f < 10; f++) {
            if (f % 2 != 0) {
                System.out.println(f + "는 2의 배수가 아니야");
                continue;
            }
            System.out.println("f : " + f);
        }
        System.out.println("----------------------");

        // do while 구문
        // do {
        //  반드시 한번은 수행이 된다.
        // } while (조건식);
        // count = 3
        // while 조건문 체크
        // do 구문 실행
        // 안녕 출력 후 count 증감 -> 1

        int count = 0;
        do {
            System.out.println("안녕");
            count++;
        } while (count < 3);
        System.out.println(count + "번 인사했어요");
    }
}

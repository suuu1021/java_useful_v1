package _my_test1;

public class Java {

    public static void main(String[] args) {

        // 형변환
        // 자동 형변환
        int intDataBox = 50;
        System.out.println(intDataBox);

        double doubleDataBox = intDataBox;
        System.out.println(doubleDataBox);

        // 강제 형변환
        double doubleDataBox2 = 10.5;
        int intDataBox2 = (int) doubleDataBox2;
        System.out.println(intDataBox2);

        System.out.println((int) 15.5);
        System.out.println("---------------------------");

        // 상수
        // 원가 59.99 할인율 30%
        // 할인율 공식 --> 할인된 가격 = 원가 - (원가 x 할인율)
        // 최종 가격은 정수로 출력
        final double PRICE = 59.99;
        final double DISCOUNT = 0.30;

        double discountPrice = PRICE - (PRICE * DISCOUNT);
        System.out.println(discountPrice);

        int finalPrice = (int) discountPrice;
        System.out.println(finalPrice);

        int a = 2;
        int b = 5;
        System.out.println("---------------------------");

        // 연산자

        // 증감, 감소 연산자
        int num = 2;
        int n1 = a++;
        System.out.println(n1);
        System.out.println(a);
        int n2 = a--;
        System.out.println(n2);
        System.out.println(a);

        // 복합대입연산자
        // +=, -=, *=, /=, %=
        int aee = 50;
        int bee = 30;
        aee += 10;
        System.out.println(aee);
        bee -= 10;
        System.out.println(bee);

        //관계연산자
        boolean cee = aee != bee;
        System.out.println(cee);

        //논리연산자 && || !
        int dog = 100;
        int cat = 50;
        // && 논리곱 두 항 모두 참일 때 참
        boolean b1 = (dog > 10) && (cat > 10); // true
        System.out.println(b1);
        boolean b2 = (dog > 10) && (cat < 10);// false
        System.out.println(b2);
        // || 논리합 두 항 중 하나만 참이어도 참
        boolean b3 = (dog > 10) || (cat < 10); // true
        System.out.println(b3);
        boolean b4 = (dog < 10) || (cat < 10); // false
        System.out.println(b4);
        // ! 부정 참 -> 거짓, 거짓 -> 참 으로 바꿈
        boolean b5 = !(dog > 10); // false
        System.out.println(b5);

        // 조건 연산자
        // 조건식 ? 결과 1 : 결과 2
        int abc = (5 > 2) ? 5 : 2; // 5
        System.out.println(abc);
    }
}

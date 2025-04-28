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

        System.out.println((int)15.5);

        // 상수
        // 원가 59.99 할인율 30%
        // 할인율 공식 --> 할인된 가격 = 원가 - (원가 x 할인율)
        // 최종 가격은 정수로 출력
        final double PRICE = 59.99;
        final double DISCOUNT = 0.30;

        double discountPrice = PRICE - (PRICE*DISCOUNT);
        System.out.println(discountPrice);

        int finalPrice = (int)discountPrice;
        System.out.println(finalPrice);

        int a = 2;
        int b = 5;



    }

}

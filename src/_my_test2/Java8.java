package _my_test2;

public class Java8 {
    /**
     * this란?
     * 1. 인스턴스(객체) 자신의 메모리를 가리킨다.
     * 2. 생성자에서 또 다른 생성자를 호출할 때 사용할 수 있다.
     * 3. 자신의 주소(참조값,주소값)를 반환 시킬 수 있다.
     */

    private String name;
    private String phone;
    private int age;

    // 1. 자신의 메모리를 가리킴
    public Java8(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("1번 생성자");
    }

    // 2. 생성자에서 다른 생성자 호출
    public Java8(String name, int age, String phone) {
        // this.name = name;
        // this.age = age;
        this(name, age);
        this.phone = phone;
        System.out.println("2번 생성자");
    }

    public static void main(String[] args) {

        Java8 java8 = new Java8("밍밍이", 10, "010-0000-0000");
    }

}

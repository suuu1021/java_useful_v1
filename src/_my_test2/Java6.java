package _my_test2;

public class Java6 {
    /**
     * 생성자
     * 클래스의 인스턴스, 즉 객채를 생성할 때 호출되는 특별한 유형의 메서드
     * 객체가 올바르게 사용될 수 있도록 필요한 값들을 설정하고, 필요한 초기화 코드를 실행합니다.
     * 생성자의 이름은 클래스 이름과 동일해야 한다.
     * 반환 타입을 가지지 않으며 void 도 사용하지 않는다.
     * 객체 생성 시 new 키워드와 함께 자동으로 호출됩니다.
     * 생성자는 기본 생성자와 사용자 정의 생성자로 구분할 수 있습니다.
     */

    int busId;
    String busName;
    String company;

    // 생성자 오버로딩
    public Java6(int id) {
        busId = id;
    }

    public Java6(int id, String name) {
        busId = id;
        busName = name;
    }

    public Java6(int id, String name, String com) {
        busId = id;
        busName = name;
        company = com;
    }

    public void showInfo() {
        System.out.println("------상태창------");
        System.out.println("버스 아이디 : " + busId);
        System.out.println("버스 이름 : " + busName);
        System.out.println("버스 회사 : " + company);
    }

    public static void main(String[] args) {
        Java6 b1 = new Java6(123);
        Java6 b2 = new Java6(456, "시내버스");
        Java6 b3 = new Java6(456, "시내버스", "부산버스");
        b3.showInfo();
    }

}

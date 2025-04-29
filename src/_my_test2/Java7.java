package _my_test2;

public class Java7 {
/**
 * 접근 제어 지시자
 * public - 어디서나 접근 가능
 * default - 같은 패키지 내에서만 접근 가능
 * private - 해당 클래스 내부에서만 접근 가능
 * protect - 같은 패키지, 클래스 내부에서 접근 가능,
 *         - 다른 패키지는 상속을 통해서만 접근 가능
 */

    /**
     * getter, setter 메서드
     * getter 외부에서 private 값을 리턴받을 수 있다.
     * setter 멤버 변수의 값을 초기화 하거나 변경할 수 있다.
     */

    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String n) {
        name = n;
    }

    public void setMoney(int m) {
        if (m < 0) {
            System.out.println("0 이하의 값은 넣을 수 없습니다");
        } else {
            money = m;
        }
    }

    public void deposit(int pay) {
        money = money + pay;
    }

    public void withdraw(int pay) {
        money = money - pay;
    }

    public void showInfo() {
        System.out.println("이름 " + name);
        System.out.println("현재 계좌 잔액은 " + money + " 입니다");
    }

    public Java7(String na) {
        name = na;
    }

}

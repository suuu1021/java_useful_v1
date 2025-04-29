package _my_test2;

public class Bus {

    int busNumber;
    int count;
    int money;

    public Bus(int number) {
        busNumber = number;
    }

    public void take(int pay) {
        money = money + pay;
        count++;
    }

    public void showInfo() {
        System.out.println("------상태창------");
        System.out.println("버스 번호 : " + busNumber);
        System.out.println("버스 승객 수 : " + count);
        System.out.println("버스 수익금 : " + money);
    }
}

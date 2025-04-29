package _my_test2;

public class Student {

    String name;
    int money;

    public Student(String n, int m) {
        name = n;
        money = m;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        money = money - 1000;
    }

    public void showInfo() {
        System.out.println("------상태창------");
        System.out.println("학생 이름 : " + name);
        System.out.println("학생 소지금 : " + money);
    }
}

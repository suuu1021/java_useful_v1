package _my_test2;

public class GoingToSchool {

    public static void main(String[] args) {

        Bus bus1 = new Bus(123);
        Student student1 = new Student("이름", 10_000);

        student1.takeBus(bus1);
        student1.takeBus(bus1);
        student1.takeBus(bus1);
        student1.showInfo();

        bus1.showInfo();

    }
}

package _my_test2;

public class Java5 {
    /**
     * 메서드란?
     * 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
     * 메서드는 멤버 변수를 활용해서 기능을 구현한다.
     */

    // 클래스 설계하는 측
    int studentId;
    String studentName;

    public void study() {
        System.out.println(studentName + "이 공부를 합니다.");
    }

    public void breakTime() {
        System.out.println(studentName + "이 휴식을 합니다.");
    }

    public void showInfo() {
        System.out.println("------상태창-------");
        System.out.println("학생 아이디 : " + studentId);
        System.out.println("학생 이름 : " + studentName);
    }

    // 코드를 실행하는 측
    public static void main(String[] args) {
        Java5 student1 = new Java5();
        student1.studentName = "티모";
        student1.studentId = 123;

        Java5 student2 = new Java5();
        student2.studentName = "아리";
        student2.studentId = 456;

        System.out.println(student1.studentName);
        System.out.println(student1.studentId);
        student1.study();
        student1.breakTime();
        student1.showInfo();

    }


}

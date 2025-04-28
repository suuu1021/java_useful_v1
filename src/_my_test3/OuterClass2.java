package _my_test3;

public class OuterClass2 {

    //메서드
    public void display(){

        // 지역 내부 클래스 선언
        class LocalInnerClass {
            void printMessage (){
                System.out.println("안녕 나는 지역 내부 클래스 메서드야");
            }
        }

        LocalInnerClass c1 = new LocalInnerClass();
        c1.printMessage();
    }

    public static void main(String[] args) {

        OuterClass2 o2 = new OuterClass2();
        o2.display();
    }
}

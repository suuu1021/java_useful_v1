package thread;

public class ThreadMainTest1 {

    // 메인 함수 - 메인 스레드
    public static void main(String[] args) {

        System.out.println("main thread 동작 start");
        MyThread thread1 = new MyThread();
        thread1.start();
        // thread1.run();
        System.out.println();
        System.out.println("main thread 동작 end");

    } // end of main

} // end of class

// 1. 스레드를 만드는 방법 - 1
// start() 메서드를 호출하면 -- run() 안에 구현부가 동작하게 됩니다.
class MyThread extends Thread {

    @Override
    public void run() {
        int i;
        for (i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

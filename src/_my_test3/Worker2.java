package _my_test3;

// 인터페이스를 사용해서 스레드를 만드는 방법
public class Worker2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

        Worker2 worker2 = new Worker2();
        Thread work2 = new Thread(worker2);
        work2.start();
    }
}

package _my_test3;

// 상속을 통해서 스레드를 만드는 방법
public class Worker extends Thread {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("woker " + name + " : " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("워커1");
        worker1.start();

    }
}

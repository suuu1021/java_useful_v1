package _my_test3;

public class BankAccount {

    private int money = 100_000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 입금
    public void deposit(int money) {
        int currentMoney = getMoney();
        synchronized (this) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            setMoney(currentMoney + money);
            System.out.println("입금 후 잔액 : " + getMoney());
        }
    }


    // 출금
    public synchronized int withDraw(int money) {
        int currentMoney = getMoney();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (currentMoney < money) {
            System.out.println("잔액이 부족합니다");
            return 0;
        } else {
            setMoney(currentMoney - money);
            System.out.println("출금 후 잔액 : " + getMoney());
            return 0;
        }
    }
}

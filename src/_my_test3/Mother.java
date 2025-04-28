package _my_test3;

public class Mother extends Thread {

    // 출금 요청
    BankAccount bankAccount;

    public Mother(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.withDraw(5_000);
    }
}

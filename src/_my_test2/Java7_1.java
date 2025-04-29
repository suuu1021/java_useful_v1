package _my_test2;

public class Java7_1 {

    public static void main(String[] args) {

        Java7 java7 = new Java7("밍밍이");
        java7.deposit(10_000);
        java7.withdraw(6_000);
        java7.showInfo();

        System.out.println(java7.getName());
        System.out.println(java7.getMoney());

        java7.setName("핑핑이");
        java7.setMoney(12_000);
        System.out.println(java7.getName());
        System.out.println(java7.getMoney());
    }
}

package day27.day03;

public class Test {
    public static void main(String[] args) {
        Account  account=new Account();
        account.deposit(500);
        System.out.println(account.balance);
        account.withdraw(200);
        System.out.println(account.balance);
    }
}

package selfcheck.ch09;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
        System.out.println("현재 잔액 : " + balance + "원");
    }
    public void withdraw(double amount) throws LowBalanceException {
        System.out.println(amount + "원을 출금합니다.");
        if (amount > balance) {
            throw new LowBalanceException("잔액이 부족합니다.");
        }
        balance -= amount;
        System.out.println(amount + "원이 출금되었습니다.");
        System.out.println("현재 잔액 : " + balance + "원");
    }
    public double getBalance() {
        return balance;
    }
}

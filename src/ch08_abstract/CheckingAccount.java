package ch08_abstract;

public class CheckingAccount extends BankAccount {
    // 생성자
    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
        //this.interestRate = interestRate;
    }

    // 오버라이딩해서 추상메서드 구현 (출금 메서드)
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
            System.out.println("현재 잔액 : " + balance + "원");
        } else {
            System.out.println("잔액이 부족해 출금할 수 없습니다.");
        }
    }

    // 오버라이딩해서 추상메서드 구현 (입금 메서드)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
            System.out.println("잔액 : " + balance + "원");
        } else {
            System.out.println("입금액은 0보다 커야 합니다.");
        }
    }
}

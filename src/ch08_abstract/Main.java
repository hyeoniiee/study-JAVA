package ch08_abstract;

public class Main {
    public static void main(String[] args) {
        // 입출금 계좌 객체 생성
        CheckingAccount mySavings = new CheckingAccount("123-4567-8901", 100000);
        mySavings.displayAccountInfo();
        mySavings.withdraw(100000); // 출금
        mySavings.deposit(50000); // 입금
    }
}

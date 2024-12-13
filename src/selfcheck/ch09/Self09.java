package selfcheck.ch09;

public class Self09 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000); // 처음 금액 :  100,000원
        try {
            account.deposit(50000); // 50.000 입금
            account.withdraw(200000); // 200.000 출금
        } catch (LowBalanceException e) {
            System.out.println("오류 : " + e.getMessage());
        } finally {
            System.out.println("현재 잔액 : " + account.getBalance() + "원");
        }
    }
}

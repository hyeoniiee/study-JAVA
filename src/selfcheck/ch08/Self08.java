package selfcheck.ch08;

public class Self08 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("123-456-1234", 0, 0.2, 1000);
        savings.addMonthlyDeposit(); // 매월 적금액 추가
        savings.addInterest(); // 이자 계산 및 추가
        savings.withdraw(100);
        savings.displayAccountInfo();
    }
}

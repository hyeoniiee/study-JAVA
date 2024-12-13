package selfcheck.ch09;

public class LowBalanceException extends Exception { // 사용자 정의 예외 클래스
    public LowBalanceException(String message) {
        super(message);
    }
}
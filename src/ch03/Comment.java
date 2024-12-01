package ch03;

public class Comment {
    public static void main(String[] args) {
        /*
        블록 주석 예제입니다.
        여러 줄을 모두 주석으로 처리합니다.
         */
        /* 한 줄 주석 : 변수를 사용한 사칙연산 */
        int x = 20; // 한 줄 전체를 주석, 한 줄의 일부를 주석처리시 사용한다.
        int y = 10;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }
}

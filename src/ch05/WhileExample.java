package ch05;

public class WhileExample {
    public static void main(String[] args) {
        /*
        while (조건식) {
            실행문; // 반복 실행할 명령문
        }
        조건식을 만족하면 참이라하고 한다.
        조건식이 참인 동안 while 문 안의 명령문을 반복해서 실행한다.
         */
        int value;
        int i = 1;
        while (i <= 9) {
            value = 3 * i;
            System.out.println("3 x " + i + " = " + value);
            i++;
        }
    }
}

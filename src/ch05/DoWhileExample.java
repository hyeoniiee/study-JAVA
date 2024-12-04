package ch05;

public class DoWhileExample {
    public static void main(String[] args) {
        /*
        do {
            실행문;
        } while (조건식);
        조건식과 상관없이 무조건 한 번은 명령문을 실행한다.
         */
        int number;
        int i = 1;
        do {
            number = 3 * i;
            System.out.println("3 x " + i + " = " + number);
            i++;
        } while (i <= 9);

        /*
        int i = 1;
        while (i < 1) {
            System.out.println("while 문 " + i + "번째 실행");
            i++;
        }
        System.out.println("현재 i 변수의 값: " + i);
        while문 안에 있는 명령문은 실행되지 않고 while문 밖에 있는 명령문만 실행된다.
         */

        /*
        int i = 1;
        do {
            System.out.println("do-while 문 " + i + "번째 실행");
            i++;
        } while (i < 1);
        System.out.println("현재 i 변수의 값: " + i);
        조건을 만족하지 않더라도 중괄호 안 명령문을 무조건 한 번은 실행한다.
         */
    }
}

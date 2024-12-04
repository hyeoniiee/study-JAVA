package ch05;

public class ForExample {
    public static void main(String[] args) {
        /*
        for (초기값; 조건식; 증감식) {
            실행문; // 반복 실행할 명령문
        }
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        int num1 = 5;
        int num2 = 5;
        int result1 = num1++;
        int result2 = ++num2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(num1);
        System.out.println(num2);

        int sum = 0; // 변수 선언 및 초기화
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

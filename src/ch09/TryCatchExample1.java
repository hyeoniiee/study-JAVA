package ch09;

import java.util.Scanner;

public class TryCatchExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요.--> ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요.--> ");
        int b = sc.nextInt();
        try {
            int result = a / b;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}

package ch04;

import java.util.Scanner;

public class Conditional01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        조건이 하나일때 : if - else
        if (조건) {
            실행문; // 조건을 만족할 때 실행할 실행문
        } else { // else 문은 생략가능
            실행문; // 조건을 만족하지 않을 때 실행할 실행문
        }
         */
        int score = 80;
        if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else {
            System.out.println("A학점이 아닙니다.");
        }

        int score1 = 60;
        if (score1 > 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다. 다음에 다시 도전하세요");
        }

        int num = sc.nextInt();
        if (num / 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}

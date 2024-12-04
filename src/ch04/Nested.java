package ch04;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        /*
        중첩 조건문 : 조건문 안에 조건문이 중첩되어있다.
        if-else 문 안에 if-else 문이 들어있는 형태
         */
        System.out.println("학년을 입력하세요.");
        Scanner scanGrade = new Scanner(System.in);
        int grade = scanGrade.nextInt();
        if (grade == 4) {
            System.out.println("점수를 입력하세요.");
            Scanner scanScore= new Scanner(System.in);
            int score = scanScore.nextInt();
            if (score >= 90 ) {
                System.out.println("장학금 지급 대상입니다.");
            } else {
                System.out.println("장학금 지급 대상이 아닙니다.");
            }
        } else {
            System.out.println("장학금 지급 학년이 아닙니다");
        }
    }
}

package ch04;

public class Conditional02 {
    public static void main(String[] args) {
        /*
        조건이 여러 개일때 : else if
        if (조건1) {
            실행문; // 조건 1을 만족할 때 실행할 실행문
        } else if (조건2) { // else 문은 생략가능
            실행문; // 조건 2를 만족할 때 실행할 실행문
        } else if (조건3) {
            실행문; // 조건 3을 만족할 때 실행할 실행문
        } else {
            실행문; // 조건을 모두 만족하지 않을 때 실행할 실행문
        }
         */
        int score = 80;
        if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else if (score >= 80 && score < 90) {
            System.out.println("B학점 입니다.");
        } else if (score >= 70 && score < 80) {
            System.out.println("C학점 입니다.");
        } else {
            System.out.println("F학점 입니다.");
        }

        if (!(score >= 90)) {
            System.out.println("A학점이 아닙니다.");
        } // ! 연산자 : 조건을 만족하면 거짓, 만족하지 않으면 참을 반환
    }
}

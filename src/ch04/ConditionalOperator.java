package ch04;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        // (조건) ? A : B
        // 조건이 참이면 A, 거짓이면 B를 선택한다.
        System.out.println("점수를 입력하세요. (예: 95, 90, 85, 80)");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String grade = (input >= 90) ? "A" : "B";
        System.out.println(grade + "학점입니다.");
    }
}

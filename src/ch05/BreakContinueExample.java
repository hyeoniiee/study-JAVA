package ch05;

import java.util.Scanner;

public class BreakContinueExample {
    public static void main(String[] args) {
        /*
        while (true) {
            실행문;
            break;
        }
        반복문에서 break 문을 만나면 조건과 상관없이 반복문을 탈출한다.
         */
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("숫자를 무한 반복해서 더하는 중입니다. ");
            System.out.print("숫자를 입력하세요. : ");
            int input = sc.nextInt();
            /*
            if (input % 2 == 1) { // 입력값이 홀수라면
                System.out.println("홀수입니다. 짝수를 입력해 주세요.");
                continue; // 이후 명령문은 수행하지 않고 다음 반복으로 건너뛰기
            }
            */
            sum = sum + input;
            System.out.println("결과: " + sum);
            if (sum > 10000) { // 합계가 10,000보다 크면
                break; // 반복문 탈출
            }
        }
        System.out.println("반복문을 탈출했습니다.");
    }
}

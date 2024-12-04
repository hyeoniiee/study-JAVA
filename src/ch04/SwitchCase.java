package ch04;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        switch (조건) {
            case (값1):
                실행문;
                break;
            case (값2):
                실행문;
                break;
            ,,,
            default: // 생략가능
                실행문;
                break;
        }
         */
        System.out.println("점수를 입력하세요. ");

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch (score) {
            case (100):
            case (99):
            case (98):
            case (97):
            case (96):
            case (95):
            case (94):
            case (93):
            case (92):
            case (91):
            case (90):
                System.out.println("A학점입니다.");
                //break; 생략하면 조건문을 탈출하지 않고 다음 case 블록으로 간다.
            case (80):
                System.out.println("B학점입니다.");
                break;
            case (70):
                System.out.println("C학점입니다.");
                break;
            default:
                System.out.println("D학점입니다.");
                break;
        }
    }
}

package selfcheck;

import java.util.Scanner;

public class self05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔액
        System.out.println("---- 자판기 프로그램을 시작합니다. ----");

        while (true) {
            System.out.println("현재 투입 금액: " + balance + "원");
            System.out.println("1. 콜라 (1,500원)");
            System.out.println("2. 오렌지주스 (2,000원)");
            System.out.println("3. 생수 (1,000원)");
            System.out.println("4. 종료");
            System.out.print("음료를 고르세요. (번호 입력): ");
            int choice = sc.nextInt();
            // 번호 선택 시
            switch (choice) {
                case 1:
                    if (balance >= 1500) {
                        balance = balance - 1500;
                        System.out.println("콜라를 선택했습니다. 남은 금액 : " + balance + "원\n");
                    } else {
                        System.out.println("금액이 부족합니다. 돈을 더 투입하세요.\n");
                    }
                    break;
                case 2:
                    if (balance >= 2000) {
                        balance = balance - 2000;
                        System.out.println("오렌지주스를 선택했습니다. 남은 금액 : " + balance + "원\n");
                    } else {
                        System.out.println("금액이 부족합니다. 돈을 더 투입하세요.");
                    }
                    break;
                case 3:
                    if (balance >= 1000) {
                        balance = balance - 1000;
                        System.out.println("생수를 선택했습니다. 남은 금액 : " + balance + "원\n");
                    } else {
                        System.out.println("금액이 부족합니다. 돈을 더 투입하세요.");
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 선택해주세요.");
            }
            // 금액 투입 안내
            System.out.print("돈을 투입하세요. (0을 입력하면 메뉴로 돌아갑니다.) : ");
            int money = sc.nextInt();
            if (money > 0) {
                balance += money;
            } else {
                System.out.println("메뉴로 돌아갑니다.");
            }
        }
    }
}

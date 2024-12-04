package onecheck;

import java.util.Scanner;

public class ch04_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String grade = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(grade);
    }
}

package onecheck;

import java.util.Scanner;

public class ch04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num / 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}

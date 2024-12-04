package ch05;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        int value;
        for (int i = 1; i <= 9 ; i++) {
            value = 3 * i;
            System.out.println("3 X " + i + " = " + value);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 단을 출력할까요? (예: 3) : ");
        int a = sc.nextInt();
        for (int i = 1; i <= 9 ; i++) {
            value = a * i;
            System.out.println(a + " X " + i + " = " + value);
        }
    }
}

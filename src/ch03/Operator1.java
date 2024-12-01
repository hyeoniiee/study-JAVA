package ch03;

import java.util.Scanner;

public class Operator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("덧셈 결과 : " + add);
        System.out.println("뺄셈 결과 : " + sub);
        System.out.println("곱셈 결과 : " + mul);
        System.out.println("나눗셈 결과 : " + div);
    }
}

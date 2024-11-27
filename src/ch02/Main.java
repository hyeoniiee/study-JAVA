package ch02;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Hello");
        System.out.print("Java");

        System.out.print("Hello\n");
        System.out.print("Java\n");

        System.out.println("Hello");
        System.out.println("Java");

        System.out.println((char)System.in.read());

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine()); // Enter 을 기준으로 한 줄 단위
        System.out.println(sc.next()); // 공벡 문자를 기준으로 단어 단위
        sc.close(); // 닫지않으면 계속해서 메모리 낭비, 명시적으로 닫아주면 문제 발생 예방
    }
}
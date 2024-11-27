package ch03;

public class Main {
    public static void main(String[] args) {
        // 자료형 변수명;
        int a; // 변수 선언
        int b = 10; // 변수 선언 및 초기화
        a = 11; // 변수 초기화
        System.out.println(a);
        System.out.println(b);

        // 자료형 변수명 = 값;
        // 기본 자료형 primitive data type
        int intNumber = 123; // 정수형 변수 4바이트
        long longNumber = 123L; // 정수형 변수 8바이트
        float floatNumber = 123.456f; // 실수형 변수 4바이트
        double doubleNumber = 123.456; // 실수형 변수 8바이트
        char charTxt = 'a';
        char charNumber = '1'; // 숫자지만 문자로 인식
        boolean isTrue = true; // 참
        boolean isFalse = false; // 거짓

        // 문자열 String " " 사용
        // 참조 자료형 reference data type : 값이 저장된 주소 저장
        String strTxt = "a";
        String strWord = "Java";
        String strNumber = "123";
        String strKor = "자바 자율학습";
    }
}

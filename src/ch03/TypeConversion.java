package ch03;

public class TypeConversion {
    public static void main(String[] args) {
        // 형변환 : 어떤 자료의 값을 다른 자료형으로 바꾸는 것
        // (자료형) 변수;
        int a = 100;
        int b = 3;
        int div1 = a / b;
        float div2 = a / b;
        float div3 = (float) a / (float) b;
        double div4 = (double) a / (double) b;
        System.out.println(div1); // 33
        System.out.println(div2); // 33.0
        System.out.println(div3); // 33.3333...
        System.out.println(div4); // 33.333333333333...
        // float 와 double 에는 변수가 담을 수 있는 크기에 제한이 있어 더 큰 값을 표현하고 싶다면 double 형을 사용한다.

        // 명시적 형변환 과 묵시적 형변환
        int num1 = 123;
        float num2 = 12.3F;
        // int result = num1 + num2; 에러 java: incompatible types: possible lossy conversion from float to int 발생
        int result1 = num1 + (int)num2; // 변환할 자료형을 정확히 표시해 형변환하는 것을 강제 형변환 또는 명시적 형변환 이라 한다.
        System.out.println("명시적 형변환 : " + result1);
        float result2 = num1 + num2; // 값의 범위를 파악해 자동으로 자료형이 바뀌는 것을 자동 형변환 또는 묵시적 형변환 이라 한다.
        System.out.println("묵시적 형변환 : " + result2);

    }
}

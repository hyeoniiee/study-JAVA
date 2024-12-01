package ch03;

public class Operator {
    public static void main(String[] args) {
        // = 대입 연산자
        System.out.println(100 + 3);
        System.out.println(100 - 3);
        System.out.println(100 * 3);
        System.out.println(100 / 3);

        int a = 100;
        int b = 3;
        // 산술 연산자 + - * /
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        System.out.println(123 + 4); // 127
        // "" 는 문자열이고 + 연산자를 사용하면 문자열을 하나로 연결할 수 있다.
        System.out.println("123" + 4); // 1234
        System.out.println("123" + "456");
        System.out.println("abc" + "가나다");
        System.out.println("코딩" + "자율학습");

        int age = 20;
        System.out.println("나는 올해 " + age + "살 입니다.");
    }
}

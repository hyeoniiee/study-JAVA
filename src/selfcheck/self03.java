package selfcheck;

import java.util.Scanner;

public class self03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. --> ");
        int intValue = sc.nextInt();
        System.out.print("실수를 입력하세요. --> ");
        double doubleValue = sc.nextDouble();

        int sum = intValue + (int)doubleValue;
        double difference = (double)intValue - doubleValue;
        double product = (double)intValue * doubleValue;
        int quotient = intValue / (int)doubleValue;

        System.out.println("덧셈 결과(정수): " + sum);
        System.out.println("뺄셈 결과(실수): " + difference);
        System.out.println("곱셈 결과(실수): " + product);
        System.out.println("나눗셈 결과(정수): " + quotient);
        sc.close();
    }
}

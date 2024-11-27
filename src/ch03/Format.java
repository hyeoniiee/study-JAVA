package ch03;

public class Format {
    public static void main(String[] args) {
        // System.out.printf("서식_지정자", 값);
        // printf 는 줄 바꿈 기능이 없어 결과를 한줄씩 출력하고 싶다면 %n , \n 을 추가한다.
        /*
        주요 서식 지정자
        %d : 정수     %f : 실수
        %c : 문자     %s : 문자열
         */
        System.out.printf("이름 : %s%n", "코린이");
        System.out.printf("나이 : %d\n", 20);
        System.out.printf("취미 : %s%n", "코딩");

        // 서식 지정자의 개수와 값의 개수는 동일해야한다. 서식 지정자의 출력 형태에 맞는 값을 넣어야 한다.
        System.out.printf("이름 : %s%n나이 : %d\n취미 : %s%n", "코린이", 21, "코딩");
        System.out.printf("%.4f", 123.45f); // 소수점 4자리까지 출력후 빈자리는 0으로 채움
    }
}

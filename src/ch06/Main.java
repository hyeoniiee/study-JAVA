package ch06;

public class Main {
    public static void main(String[] args) {
        int score1 = 80;
        int score2 = 90;
        int score3 = 100;
        int score4 = 70;
        System.out.println("1번 학생의 점수 : " + score1);
        System.out.println("2번 학생의 점수 : " + score2);
        System.out.println("3번 학생의 점수 : " + score3);
        System.out.println("4번 학생의 점수 : " + score4);

        // 배열 : 같은 자료형의 값 여러개를 변수 하나로 묶어 관리하는 것
        // 배열의 인덱스는 항상 0부터 시작한다.
        // 형식 : 자료형[] 배열명; / 자료형 배열명[];
        int [] ages; // 정수형 배열 선언
        String[] name; // 문자열 배열 선언

        // 자료형[] 배열명 = {값1, 값2, ...};
        int[] scoreArray = {80, 90, 100, 70}; // 정수형 배열 선언 및 초기화
        String[] fruits = {"Apple", "Banana", "Orange", "Grape"}; // 문자열 배열 선언 및 초기화

        // 자료형[] 배열명 = new 자료형[배열_크기];
        int[] scoreArray1 = new int[4];

        System.out.println("1번 학생의 점수: " + scoreArray[0]); // 인덱스 0에 있는 값 출력
        System.out.println("2번 학생의 점수: " + scoreArray[1]); // 인덱스 1에 있는 값 출력
        System.out.println("3번 학생의 점수: " + scoreArray[2]); // 인덱스 2에 있는 값 출력
        System.out.println("4번 학생의 점수: " + scoreArray[3]); // 인덱스 3에 있는 값

        // 배열명[인덱스] = 새로운_값;
        scoreArray[0] = 50; // 값 변경
        scoreArray[1] = 60; // 값 변경
        scoreArray[2] = 70; // 값 변경
        scoreArray[3] = 80; // 값 변경

        /*
        scoreArray[0] = 80; // 인덱스 0에 값 80 저장
        scoreArray[1] = 90; // 인덱스 1에 값 90 저장
        scoreArray[2] = 100; // 인덱스 2에 값 100 저장
        scoreArray[3] = 70; // 인덱스 3에 값 70 저장;
        */

        int[] intArr = new int[5];
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        intArr[4] = 40;
        System.out.println("배열 크기: " + intArr.length);

        for (int i = 0; i < 4; i++) {
            System.out.println(i + 1 + "번 학생의 점수: " + scoreArray[i]);
        }

        for(int i = 0; i < scoreArray.length; i++) {
            System.out.println(i + 1 + "번 학생의 점수: " + scoreArray[i]);
        }
    }
}

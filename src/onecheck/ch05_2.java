package onecheck;

public class ch05_2 {
    public static void main(String[] args) {
        int count = 0; // 실행 횟수를 저장할 변수
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.println("i = " + i + ", j = " + j);
                count++;
            }
        }
        System.out.println(count + "번 실행");

    }
}

package onecheck.ch04;

public class ch04_3 {
    public static void main(String[] args) {
        int score = 80;
        if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else if (score >= 80 ) { // 90점 이하
            System.out.println("B학점 입니다.");
        } else if (score >= 70) { // 80 점 이하
            System.out.println("C학점 입니다.");
        } else {
            System.out.println("F학점 입니다.");
        }
    }
}

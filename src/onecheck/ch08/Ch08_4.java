package onecheck.ch08;

public class Ch08_4 {
    public static void main(String[] args) {
        // 추상 클래스는 객체를 생성할 수 없다. 컴파일 오류발생
        // PersonAbstract student1 = new PersonAbstract("코천이", 20, 1); // 1번
        StudentAbstract student2 = new StudentAbstract("길벗이", 21, 2); // 2번
        // PersonAbstract 타입 변수는 StudentAbstract 클래스에 새로 정의한 메서드에 접근할 수 없다.
        // student1.introduce(); // 3번
        // student1.gradeInfo(); // 4번
        student2.introduce(); // 5번
        student2.gradeInfo(); // 6번
    }
} // 1, 3, 4 번이 오류코드이다.

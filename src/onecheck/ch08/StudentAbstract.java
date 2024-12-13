package onecheck.ch08;

public class StudentAbstract extends PersonAbstract{
    // StudentAbstract 클래스는 PersonAbstract 클래스를 상속받음
    int grade;

    // 생성자
    public StudentAbstract(String name, int age, int grade) {
        super(name, age); // 부모 클래스의 생성자 호출
        this.grade = grade;
    }

    // 오버라이딩으로 추상메서드인 introduce 메서드 구현
    @Override
    public void introduce() {
        System.out.println("안녕! 내 이름은 " + name + "고, 나이는 " + age + "살이야.");
    }
    // 자식 클래스만의 새로운 메서드
    public void gradeInfo() {
        System.out.println("현재 " + grade + "학년이야.");
    }
}

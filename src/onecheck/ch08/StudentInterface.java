package onecheck.ch08;

public class StudentInterface implements PersonInterface{
    String name;
    int age;
    int grade;

    // 생성자
    public StudentInterface(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // introduce 메서드 구현
    @Override
    public void introduce() {
        System.out.println("안녕! 내 이름은 " + name + "고, 나이는 " + age + "살이야.");
    }

    public void gradeInfo() {
        System.out.println("현재 대학교 " + grade + "학년이야.");
    }
}

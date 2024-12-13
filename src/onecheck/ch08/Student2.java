package onecheck.ch08;

public class Student2 extends Person2{
    int grade;

    public Student2(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void gradeInfo() {
        System.out.println("현재 대학교 " + grade + "학년이야");
    }
}

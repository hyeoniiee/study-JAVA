package onecheck.ch08;

public class Ch08_5 {
    public static void main(String[] args) {
        StudentInterface student =
                new StudentInterface("코린이", 20, 1);
        student.introduce();
        student.gradeInfo();
    }
}

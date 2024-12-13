package onecheck.ch08;

public abstract class PersonAbstract {
    // 추상 클래스 PersonAbstract 선언
    String name;
    int age;

    // 생성자
    public PersonAbstract(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 추상 메서드 선언
    public abstract void introduce();
}

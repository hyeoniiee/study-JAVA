package onecheck.ch08;

public class Person2 {
    String name;
    int age;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.println("안녕! 내 이름은 " + name + "이고, 나이는 " + age + "살이야.");
    }
}

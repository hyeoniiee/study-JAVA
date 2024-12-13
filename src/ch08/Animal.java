package ch08;

public class Animal {
    String name = "동물";
    int age;

    public void printName() {
        System.out.println("부모 클래스의 name : " + name);
    }

    // Animal 클래스의 생성자
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//        System.out.println("이름 : " + this.name + "\n나이 : " + this.age);
//    }

    void eat() {
        System.out.println(name + "가 밥을 먹습니다.");
    }
}
// 상속하는 클래스는 부모클래스, 상속받는 클래스는 자식클래스
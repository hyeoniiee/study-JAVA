package ch08;

public class Dog extends Animal { // Animal 클래스 상속
    String breed; // 견종, Dog 클래스에만 있는 필드

    String name = "강아지"; // 자식 클래스의 필드 (부모 클래스와 동일한 이름)
    public void displayNames() {
        System.out.println("자식 클래스의 name : " + this.name);
        System.out.println("부모 클래스의 name : " + super.name);
    }

    // Dog 클래스의 생성자
//    public Dog(String name, int age, String breed) {
//        super(name, age); // 부모 클래스의 생성자 호출
//        this.breed = breed;
//        System.out.println("품종 : " + this.breed);
//    }

    void roll() {
        System.out.println(name + "가 바닥을 구릅니다.");
    } // Dog 클래스에만 있는 메서드

    // 메서드 오버로딩 : 메서드명은 같지만 매개변수의 개수와 순서, 자료형이 다른 메서드를 같은 클래스안에 여러 개 정의하는 것.
    void roll(int times) {
        System.out.println(name + "가 바닥을 " + times + "번 구릅니다.");
    }
}
// 상속하는 클래스는 부모클래스, 상속받는 클래스는 자식클래스
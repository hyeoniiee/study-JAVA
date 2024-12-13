package ch08;

public class Cat extends Animal { // Animal 클래스 상속

    // Cat 클래스의 생성자
//    public Cat(String name, int age) {
//        super(name, age);
//    }

    void rub() {
        System.out.println(name + "가 몸을 비빕니다.");
    } // Cat 클래스에만 있는 메서드

    // 메서드 오버라이딩 : 상속받은 메서드를 재정의 한다.
    @Override // 어노테이션을 사용하여 명시적으로 나타낼 수 있다.
    void eat() {
        super.eat(); // 부모 클래스의 eat() 메서드 호출
        System.out.println(name + "가 닭고기를 먹습니다.");
    } // 자식 클래스에서 부모클래스의 메서드를 재정의하면 자식 클래스의 메서드에 우선순위가 있다.

}
// 상속하는 클래스는 부모클래스, 상속받는 클래스는 자식클래스
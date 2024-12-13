package ch08;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayNames();
        dog.printName();
//        Dog dog = new Dog("바둑이", 3, "푸들"); // 강아지 객체 생성
//        Cat cat = new Cat("나비", 2); // 고양이 객체 생성

//        dog.breed = "진돗개";
//        dog.name = "멍멍이";
//        dog.age = 1;
//        System.out.println(dog.name + "는 " + dog.breed + "이고, 나이는 " + dog.age + "살 입니다.");
//
//        cat.name = "나비";
//        cat.age = 1;
//        System.out.println(cat.name + "는 " + cat.age + "살 입니다.");

        // Animal 클래스에서 정의한 메서드
//        dog.eat();
//        dog.roll(2); // 메서드 오버로딩으로 출력값이 달라짐
//        cat.eat(); // 메서드 오버라이딩으로 출력값이 달라짐
//        cat.rub();

//        System.out.println();
//        System.out.println("----- 업, 다운 캐스팅 -----");
//        // 업캐스팅 upcasting : 자식 클래스의 객체를 부모 클래스형으로 변환. 명시적으로 형변환하지 않아도 자동으로 이루어짐
//        Animal myAnimal1 = new Dog(); // Dog 클래스 객체를 Animal 클래스형의 참조 변수에 할당
//        myAnimal1.name = "바둑이";
//        myAnimal1.eat(); // Animal 클래스의 eat() 메서드 호출
//        // 다운캐스팅 downcasting : 부모클래스형 객체를 자식 클래스형으로 형 변환 하는것. () 안에 넣은 자식 클래스명을 변환하려는 개체 앞에 붙여 명시함.
//        Dog myDog = (Dog)myAnimal1;
//        myDog.roll();
//        // myAnimal.roll(); 오류 발생. 자식클래스에 정의된 메서드
//
//        Animal myAnimal2 = new Cat(); // Cat 클래스 객체를 Animal 클래스형의 참조 변수에 할당
//        myAnimal2.name = "나비";
//        myAnimal2.eat(); // Cat 클래스에 오버라이딩된 eat() 메서드 호출
//        Cat myCat = (Cat)myAnimal2;
//        myCat.rub();
//        // myAnimal.rub(); 오류 발생. 자식클래스에 정의된 메서드

    }
}

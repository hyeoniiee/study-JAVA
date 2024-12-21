package ch12;

@FunctionalInterface
public interface Check { // 인터페이스 정의
    abstract boolean isEven(int n); // 추상 메서드 선언
}
/*
람다 표현식 Lambda expression
함수를 하나의 표햔식으로 나타내는 방법으로 익명함수로 작성한다.
익명함수 anonymous function 는 이름이 없는 함수로 함수를 따로 정의하지 않고 코드 자체를 변수에 할당해 변수처럼 사용한다.
([자료형] 매개변수) -> { 실행문; }
([자료형] 매개변수) -> 표현식
-> 는 화살표 연산자 arrow operator 라고 하며, 매개변수와 표현식을 구분한다.

메서드 참조 method reference 는 람다식을 더 간결하게 표현하는 방법으로 이미 존재하는 메서드를 참조해 람다식에서 사용하려 할 때 필요하다.
메서드 참조는 :: 연산자를 사용하여 표현한다.
객체명::메서드명 // 인스턴스 메서드 참조시
클래스명::메서드명 // 클래스 메서드 참조시
클래스명::new // 생성자 참조시
 */
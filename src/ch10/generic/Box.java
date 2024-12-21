package ch10.generic;

public class Box<T> {
    private T content;

    public  void setContent(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }

//    public class Box {
//    private Object content;
//    public void setContent(Object content) {
//        this.content = content;
//    }
//    public Object getContent() {
//        return content;
//    }
//}
}
/*
Generic 제너릭
타입 안전성을 보잘하고 코드 재사용성을 높이기 위해 자바에 도입된 기능
타입 매개변수를 사용한다.
class 클래스명<타입_매개변수> {} // 클래스
public <타입_매개변수> 반환형 메서드명(타입_매개변수 매개변수); // 메서드

<T> type : 클래스나 메서드에서 가장 많이 사용하는 형태의 타입 매개변수. T 는 Integer, String, Double 등 다양한 참조형으로 대체 가능
<E> element : 주로 List, Set 구현 클래스에서 요소를 나타낼때 사용. E 는 각 요소의 자료형을 의미
<K, V> key, value : Map 처럼 키 - 값 쌍을 다루는 자료구조에서 사용. K 는 키의 자료형, V 는 값의 자료형을 나타낸다.
<N> number : 주로 숫자형을 다루는 클래스나 메서드에서 사용

클래스명<자료형> 변수 = new 클래스명<자료형>();
클래스명<자료형> 변수 = new 클래스명<>();
 */
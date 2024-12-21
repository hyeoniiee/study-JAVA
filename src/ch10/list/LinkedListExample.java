package ch10.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(); // 문자열 요소만 저장 가능

        // 메서드를 사용하여 요소 추가
        list.addFirst("Apple");   // 리스트의 첫 번째 위치에 추가
        list.addLast("Banana");   // 리스트의 마지막 위치에 추가
        list.push("Cherry");      // 리스트의 첫 번째 위치에 추가 addFirst() 메서드와 같은 동작 수행

        System.out.println("리스트 상태: " + list); // 현재 리스트 상태 출력

        // getFirst() 메서드로 리스트의 첫번째 요소 반환
        System.out.println("첫 번째 요소: " + list.getFirst()); // Cherry

        // pop() 메서드로 리스트의 첫 번째 요소 삭제
        list.pop(); // Cherry 삭제
        System.out.println("리스트 상태: " + list);

        // removeLast() 메서드로 리스트의 마지막 요소 삭제
        list.removeLast();  // Banana 삭제
        System.out.println("리스트 상태: " + list);

        // addLast() 매서드로 리스트의 마지막 위치에 요소 추가
        list.addLast("Durian");
        System.out.println("리스트 상태: " + list);

        // pop() 메서드로 리스트의 첫 번째 요소 삭제
        list.pop(); // Apple 삭제
        System.out.println("리스트 상태: " + list);

        // getFirst() 메서드로 리스트의 첫번째 요소 반환
        System.out.println("첫 번째 요소: " + list.getFirst()); // Durian
        System.out.println("최종 리스트: " + list);
    }
}
/*
List 인터페이스
기본 자료구조인 리스트를 정의한 인터페이스.
- 요소들이 삽입된 순서를 유지, 중복 혀용(같은 값의 요소를 여러 번 추가 가능), 각 요소를 가리키는 인덱스가 있꼬, 이를 통해 요소에 접근가능, 크기 변경 가능

LinkedList 클래스
데이터가 연속적으로 저장되어 있지 않고, 대신 앞뒤 요소에 대한 참조를 가지고 연결돼 있다, 이런 형태의 자료구조를 이중 연결 리스트 라고 함
LinkedList<자료형> 변수 = new LinkedList<>();
List<자료형> 변수 = new LinkedList<>();
LinkedList<자료형> 변수 = new LinkedList<>(다른_컬렉션_변수);
 */
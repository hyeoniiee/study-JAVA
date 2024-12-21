package ch10.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // 문자열 요소만 저장 가능

        // add : 리스트의 끝에 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 인덱스 1에 있는 요소 접근
        System.out.println(list.get(1)); // Banana

        // 인덱스 1의 요소 수정
        list.set(1, "Durian");
        System.out.println(list.get(1)); // Durian

        // 인덱스 0에 있는 요소 삭제
        list.remove(0); // Apple 삭제

        // size() 메서드로 리스트에 있는 요소 개수 반환하여 출력
        System.out.println("리스트 크기: " + list.size()); // 리스트 크기: 2

        // isEmpty() 메서드로 리스트가 비었는지 확인
        System.out.println("리스트가 비었는가? " + list.isEmpty()); // 출력: Is empty: false
    }
}
/*
List 인터페이스
기본 자료구조인 리스트를 정의한 인터페이스.
- 요소들이 삽입된 순서를 유지, 중복 혀용(같은 값의 요소를 여러 번 추가 가능), 각 요소를 가리키는 인덱스가 있꼬, 이를 통해 요소에 접근가능, 크기 변경 가능

ArrayList 클래스
ArrayList<자료형> 변수 = new ArrayList<>([용량]);
List<자료형> 변수 = new ArrayList<>([용량]);
ArrayList<자료형> 변수 = new ArrayList<>(다른_컬렉션_변수);
 */
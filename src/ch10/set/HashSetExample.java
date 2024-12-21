package ch10.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // add : 리스트의 끝에 요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("집합 상태 : " + fruits);

        // 중복 요소 추가
        fruits.add("Apple");

        // HashSet 의 크기
        System.out.println("집합 크기 : " + fruits.size()); // 출력: 3

        // 요소 존재 확인
        System.out.println("Banana가 있는가? " + fruits.contains("Banana")); // 출력: true
        // 요소 삭제
        System.out.println("Banana가 삭제됐는가? " + fruits.remove("Banana")); // 출력: true
        // Banana 가 삭제된 후 존재 확인
        System.out.println("Banana가 있는가? " + fruits.contains("Banana")); // 출력: false
        // HashSet 이 비어 있는지 확인
        System.out.println("집합이 비어 있는가? " + fruits.isEmpty()); // 출력: false

        // HashSet 의 모든 요소 출력
        System.out.println("집합 요소:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // 출력: Apple, Orange
        }

        // HashSet 의 모든 요소 삭제
        fruits.clear();
        System.out.println("최종 집합 크기: " + fruits.size()); // 출력: 0

        // HashSet 이 비어 있는지 확인
        System.out.println("집합이 비어 있는가? " + fruits.isEmpty()); // 출력: true
        //System.out.println("최종 집합 상태: " + fruits);
    }
}
/*
Set 인터페이스
집합 자료구조를 정의한 인터페이스.
중복 요소 허용하지 않으며, 기본적으로 요소들의 순서가 정해져 있지 않다.

HashSet 클래스
요소들을 해시 테이블 (hash table, 키 - 값으로 된 데이터를 저장하는 자료구조)에 저장한다.
빠른검색, 추가, 삭제 기능을 제공, 요소의 순서는 유지되지 않음. 배열, 리스트에서 중복 요소를 삭제할 때 유용함.
HashSet<자료형> 변수 = new ArrayList<>([용량, 부하율]);
Set<자료형> 변수 = new ArrayList<>([용량, 부하율]);
HashSet<자료형> 변수 = new ArrayList<>(다른_컬렉션_변수);
 */
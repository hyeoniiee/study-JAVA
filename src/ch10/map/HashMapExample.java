package ch10.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // 과일 이름은 키, 수량을 값으로 하는 항목 추가
        map.put("Apple", 10);
        map.put("Banana", 15);
        map.put("Cherry", 20);
        map.put("Durian", 25);

        // get() 메서드로 키에 대응하는 값 출력
        System.out.println("Apple의 수량 : " + map.get("Apple")); // Apple 의 수량: 10

        // remove() 메서드로 키에 해당하는 항목 삭제 후 현재 맵 상태 확인
        map.remove("Banana");
        System.out.println("맵 상태 : " + map); // {Apple=10, Orange=20, Grapes=25}

        // containsKey() 메서드로 특정 키가 존재하는지 확인
        System.out.println("Cherry가 있는가? " + map.containsKey("Cherry")); // true

        // containsValue() 메서드로 특정 값이 존재하는지 확인
        System.out.println("값이 10인 항목이 있는가? " +map.containsValue(10)); // true

        // keySet() 메서드가 반환하는 값은 Set 형으로 변수를 Set 형으로 선언
        Set<String> keys = map.keySet();
        System.out.println("모든 키 : " + keys); // 모든 키: [Apple, Orange, Grapes]

        // values() 메서드가 반환하는 값은 Collection 형으로 변수를 Collection 형으로 선언
        Collection<Integer> values = map.values();
        System.out.println("모든 값 : " + values); // 모든 값: [10, 20, 25]

/*        // 모든 키-값 쌍을 Set으로 가져오기
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("모든 키-값 쌍: ");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // 모든 키-값 쌍:
        // Apple = 10
        // Orange = 20
        // Grapes = 25
        */
    }
}
/*
Map 인터페이스
키와 값의 한쌍으로 이루어진 자료구조를 정의한 인터페이스.
하나의 키에 하나의 값을 매핑하고 저장하며, 키는 고유해야 하지만 값은 중복될 수 있다. 같은 티로 값을 저장하면 기존 값을 덮어쓴다.

HashMap 클래스
키와 값을 한 쌍으로 저장하는 해시테이블 기반 구조.
키를 기반으로 한 데이터 검색, 삽입, 삭제가 매우 빠르며 대략의 데이터를 다룰때 효율적이다.
HashMap<자료형, 자료형> map = new HashMap<>([용량, 부하율]);
Map<자료형, 자료형> map = new HashMap<String, Integer>([용량, 부하율]);
키와 값을 한 쌍으로 저장하므로 자료형은 2개이고, 이때 자료형이 같을 필요는 없다.
 */
package selfcheck;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Self12 {
    public static void main(String[] args) {
        // numbers 리스트를 생성하고 1~6 요소 추가
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        // Predicate 인터페이스로 짝수인지 판별하는 람다식 정의
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        // 짝수만 필터링하고 결과를 담아 출력
        ArrayList<Integer> evenNumbers = filterList(numbers, isEven);
        System.out.println("짝수만 필터링한 결과 : " + evenNumbers);
    }

    // 리스트와 조건을 인수로 받아 조건에 맞는 요소들만 리스트로 반환
    public static ArrayList<Integer> filterList(ArrayList<Integer> list, Predicate<Integer> predicate) {
        ArrayList<Integer> filteredList = new ArrayList<>();
        for (Integer num : list) {
            if (predicate.test(num)) {
                filteredList.add(num);
            }
        }
        return filteredList;
    }
}

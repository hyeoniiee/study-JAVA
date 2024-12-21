package onecheck.ch10;

import java.util.HashSet;
import java.util.Iterator;

public class Ch10_3 {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(2);

        System.out.println("집합 크기 : " + number.size());

        if (number.contains(3)) {
            System.out.println("3이 포함되어 있습니다.");
        } else {
            System.out.println("3이 포함되어 있지 않습니다.");
        }

        Iterator<Integer> iterator = number.iterator();
        System.out.println("집합 요소 : ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        number.clear();
        System.out.println("집합이 비어 있는가? " + number.isEmpty());
    }
}

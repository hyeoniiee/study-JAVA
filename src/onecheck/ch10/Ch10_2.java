package onecheck.ch10;

import java.util.ArrayList;

public class Ch10_2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);

        int size = number.size();
        System.out.println("리스트의 크기 : " + size);

        for (int i = 0; i < number.size(); i++) {
            System.out.println("숫자 : " + number.get(i));
        }

        number.remove(1);
        System.out.println("요소를 삭제한 후 리스트 : " + number);
    }
}

package selfcheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Self10 {
    public static void main(String[] args) {
        // 1. ArrayList 사용
        ArrayList<String> students = new ArrayList<>();
        students.add("홍길동");
        students.add("김길벗");
        students.add("이코천");
        students.add("홍길동"); // 중복 추가

        System.out.println("학생 명단 :");
        for (String student : students) {
            System.out.println(student);
        }

        // 2. HashSet 사용
        HashSet<String> unStudents = new HashSet<>(students);
        unStudents.add("강남순");

        System.out.println();
        System.out.println("학생 명단(중복 삭제) :");
        for (String student : unStudents) {
            System.out.println(student);
        }

        // 3. HashMap 사용
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("홍길동", 85);
        studentScores.put("김길벗", 92);
        studentScores.put("이코천", 78);
        studentScores.put("강남순", 90);

        System.out.println();
        System.out.println("학생 명단과 점수:");
        for (String key : studentScores.keySet()) {
            System.out.println(key + "의 점수: " + studentScores.get(key) + "점");
        }

        System.out.println();
        if (studentScores.containsKey("홍길동")) {
            System.out.println("홍길동의 점수는 " + studentScores.get("홍길동") + "점입니다.");
        }
    }
}

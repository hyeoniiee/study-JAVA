package ch10.generic;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>(); // String 자료형의 Box 객체 생성
        box.setContent("Hello World!"); // 문자열 저장
        String content = box.getContent(); // 형변환 불필요
        System.out.println(content);
        // 잘못된 타입으로 형변환하면 컴파일 오류 발생
        // Integer number = (Integer)box.getContent();
        // Inconvertible types; cannot cast 'java. lang. String' to 'java. lang. Integer'
    }
}

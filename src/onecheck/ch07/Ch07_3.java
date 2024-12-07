package onecheck.ch07;

public class Ch07_3 {
    public static void main(String[] args) {
        NewCar newCar = new NewCar("서울0가1111"); // 객체 생성
        System.out.println("newCar의 차량번호: " + newCar.getCarNumber());
        newCar.setCarNumber("서울1가1111");
        System.out.println("변경 후 newCar의 차량번호: " + newCar.getCarNumber());
    }
}

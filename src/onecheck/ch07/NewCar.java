package onecheck.ch07;

public class NewCar {
    private String carNumber; // 차량번호
    // 생성자
    public NewCar(String carNumber) {
        this.carNumber = carNumber;
    }
    // 게터 메서드
    public String getCarNumber()  {
        return carNumber;
    }
    // 세터 메서드
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}

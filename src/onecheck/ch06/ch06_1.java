package onecheck.ch06;

public class ch06_1 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        int value = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value * (i + 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}

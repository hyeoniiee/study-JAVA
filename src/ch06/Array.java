package ch06;

public class Array {
    public static void main(String[] args) {
        // 참조자료형 : 실제 값이 아닌 메모리 주소를 저잘하는 변수의 자료형
        // 참조는 실제 값이 아닌 주소를 저장

        int[] originArray1 = {1, 2, 3};
        int[] copyArray1 = originArray1;
        System.out.println(copyArray1[0]); // 1
        System.out.println(copyArray1[1]); // 2
        System.out.println(copyArray1[2]); // 3*/

        int[] originArray = {1, 2, 3};
        int[] deepCopyArray = new int[originArray.length];
        for(int i = 0; i < originArray.length; i++) {
            deepCopyArray[i] = originArray[i];
        }
        deepCopyArray[0] = 10;
        System.out.println(originArray[0]); // 1 출력

    }
}

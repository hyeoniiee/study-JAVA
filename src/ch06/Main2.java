package ch06;

public class Main2 {
    public static void main(String[] args) {
        // 이차원배열은 행과 열로 구성된다.
        // 자료형[][] 배열명 = {{값1, 값2, ...}, {값1, 값2, ...}, ... };
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 자료형[][] 배열명 = new 자료형[행_크기][열_크기];
        int[][] arr2 = new int[3][3];

        // 배열명[행_인덱스][열_인덱스];
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        int x = 1; // int x = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = x;
                x++; // 초깃값이 0일 때는 ++x로 작성
                // matrix[i][j] = x++; 두 문장을 하나로 합쳐도 됨
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+ " "); // 값 구분을 위해 공백 추가
            }
            System.out.println(""); // 행 구분을 위해 줄 바꿈 추가
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " "); // 값 구분을 위해 공백 추가
            }
            System.out.println(""); // 행 구분을 위해 줄 바꿈 추가
        }
    }
}

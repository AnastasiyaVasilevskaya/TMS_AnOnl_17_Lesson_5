//        2. Умножение двух матриц
//        Напишите программу для умножения двух матриц.
//        Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0} }
//        Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//        Ожидаемый результат: 123 111 000
public class MultiplicationOfTwoMatrices {
    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondMatrix = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int rowsF = firstMatrix.length;
        int colsF = firstMatrix[0].length;
        int colsS = secondMatrix[0].length;

        int[][] result = new int[rowsF][colsS];

        for (int i = 0; i < rowsF; i++) {
            for (int j = 0; j < colsS; j++) {
                for (int k = 0; k < colsF; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        for (int[] number : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(number[j] + " ");
            }
            System.out.println();
        }
    }
}


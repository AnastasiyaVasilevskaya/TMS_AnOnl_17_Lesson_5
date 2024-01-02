//        1. Шахматная доска
//        Создать программу для раскраски шахматной доски с помощью цикла.
//        Создать двумерный массив стрингов 8х8. С помощью циклов задать элементам
//        циклам значения В(Black) или W(White).
public class ChessBoard {
    public static void main(String[] args) {
        int size = 8;
        String[][] chessboard = new String[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((row + col) % 2 == 0) {
                    chessboard[row][col] = "W";
                } else {
                    chessboard[row][col] = "B";
                }
                System.out.print(chessboard[row][col] + " ");
            }
            System.out.println();
        }
    }
}


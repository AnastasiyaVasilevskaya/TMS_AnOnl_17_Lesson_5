//0. Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли.

import java.util.Scanner;


public class IncreasingElements {
    public static void main(String[] args) {
        int xSize = 4;
        int ySize = 4;
        int zSize = 4;
        int[][][] array = new int[xSize][ySize][zSize];

        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                for (int z = 0; z < zSize; z++) {
                    array[x][y][z] = (int) (Math.random() * 10);
                    System.out.print(array[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число на которое хотите увеличить элементы массива: ");
        int increaseNumber = scanner.nextInt();

        System.out.println("Массив после увеличения: ");
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                for (int z = 0; z < zSize; z++) {
                    System.out.print(array[x][y][z] + increaseNumber + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

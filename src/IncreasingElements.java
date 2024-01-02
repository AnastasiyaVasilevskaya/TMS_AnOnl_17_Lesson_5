//0. Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли.

import java.util.Scanner;
public class IncreasingElements {
    public static void main(String[] args) {
        int size = 4;
        int[][][] array = new int[size][size][size];

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                for (int z = 0; z < size; z++) {
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
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                for (int z = 0; z < size; z++) {
                    System.out.print(array[x][y][z] + increaseNumber + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

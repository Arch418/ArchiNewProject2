package org.levelup.lesson2;

// массив - набор однотипных элементов
// int[] [] doubleArray = new int[10][15]; -двемерный массив (таблица 10 строк, 15 элементов (столбцов))
public class ArchiLesson2Massiv {
    public static void main(String[] args) {
        int[] array = new int[10]; //обявление массива (array)[0 ,0, 0, 0, 0, 0, 0, 0, 0, 0]
        array [0] = 45; // [45 ,0, 0, 0, 0, 0, 0, 0, 0, 0]
        array [1] = 65; // [45 ,65, 0, 0, 0, 0, 0, 0, 0, 0]
        array [4] = 54; // [45 ,65, 0, 0, 54, 0, 0, 0, 0, 0]
        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i]);
        }
    }
}

package org.levelup.lesson6;

import org.levelup.lesson7.*;

//Массив, который изменяет свой размер в зависимости от количества элементов
public class DynamicArray extends AbstractStructure {
    private int[] array; //- длина массива

    public DynamicArray(int capacity) { //контсруктор динамического масиива, который создает обычный массив строка 9
        this.array = new int[capacity];
    }

    // добавление в конец
    @Override
    public void addLast(int value) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size] = value;
    }

    public void addFirst (int value) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = value;
        size++;
    }

    private void shiftRight(){
        for (int i = size; i > 0; i--){
            array[i] = array [i-1];
        }
    }
    private void ensureCapacity () {
        int[] oldArray = array; //- сохранение старых данных
        array = new int [(int)(array.length *1.5)]; // увеличение длинны старого массива в полтора раза
        System.arraycopy(oldArray, 0, array, 0, oldArray.length); //откуда копируем, с какой позиции, куда копируем, с какой позиции начинаем вставлять, какая длина копируемого массива
    }

    //Получение по индексу


    // превращение динамического массива в строку -> toString()
    public String toString(){
        if(size == 0){
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < size; i++){
            result += array[i] + ", ";
        }
        result = result.substring(0, result.length() -2); // возвращает часть строки
       return result + "]";
    }

}

package org.levelup.lesson7;
//класс интерфейс - все состоит из абстрактных методов
// API - описание (набор) методов
import org.levelup.lesson6.*;

public class Main {
    public static void main(String[] args) {
        AbstractStructure structure = new DynamicArray(5);
        int [] array = new int []{1, 5, 3, 9};
        structure.addArray(array);
        System.out.println();
    }
}

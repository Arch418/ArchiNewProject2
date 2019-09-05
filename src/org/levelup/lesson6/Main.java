package org.levelup.lesson6;

public class Main {
    public static void main(String[] args) {
        // int [] array = new int [10];
        DynamicArray dynamicArray = new DynamicArray(10);{

            // добавление элемента в массив: array [0] = 43;
            dynamicArray.addLsat(43);
            dynamicArray.addLsat(53);
            dynamicArray.addLsat(85);
            dynamicArray.addLsat(72);
            dynamicArray.addLsat(105);
            dynamicArray.addLsat(87);
            dynamicArray.addLsat(6);
            dynamicArray.addLsat(75);
            dynamicArray.addLsat(8);
            dynamicArray.addLsat(45);
            dynamicArray.addLsat(12);
            dynamicArray.addLsat(5);
            System.out.println(dynamicArray.toString());


        }
    }
}

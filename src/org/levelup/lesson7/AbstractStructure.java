package org.levelup.lesson7;
//абстарктный класс - создается как шаблон для использования другими классами
//абстарктный метод - у него нет тела
// implements - реализует (берет из структуры)
public abstract class AbstractStructure implements Structure { // создаем абстрактный класс, чтобы другие классы не смогли вызвать конструктор этого класса (нельзя использовать объект этого класса ни где)

    protected int size;

    public void addArray(int[] value){
        for (int i = 0; i <value.length; i++){
            addLast(value[i]);
            size++;
        }
    }

    public abstract void addLast(int value); // объявление обстрактного метода, нету {})

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
}

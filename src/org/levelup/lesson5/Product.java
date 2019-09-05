package org.levelup.lesson5;
//обратная польская нотация -
import java.util.*;

public class Product {
    private String name;
    private double weight;
    private double price;
    private int energy;

    public Product(String name, double weight, double price, int energy) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.energy = energy;
    }

    @Override
    public boolean equals(Object obj) {

        // this.name -> tomato, tomato2 -> obj
        //1// obj instanceof Type(Class)
        //1// obj instanceof Product
        //2//if(obj == null || getClass() != obj.getClass()) return  false; //лучше всегда использовать ее, получает класс текущего объекта. Возвращает объект класса класс.

        if (this == obj) return true;

        // null instacneof Object - > false

        if (!(obj instanceof Product)) return false; // наследник принадлежит родительскому типу, instanceof - является ли обджек типом продакт или его наследником
        Product other = (Product) obj;

        //return name.equals(other.name) && energy == other.energy;
        return Objects.equals(name, other.name) && energy == other.energy;
    }

    public int hashCode (){
        //return Objects.hash(name, energy); -> лучше использовать ее, нежели строки 39,40,41,42
        int result = 31; // обязательно берем просто число, для расчета хешей используются простые числа.
        result += 31 * result + energy;
        result += 32 * result + name.hashCode();
        return result;

    }

}

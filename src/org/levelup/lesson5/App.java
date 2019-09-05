package org.levelup.lesson5;

public class App {
    public static void main(String[] args) {
        Product tomato = new Product("Томат", 45.32, 235.43, 40); // ctrl + d - копировать и вставить строку ниже
        Product tomato2 = new Product("Томат", 45.32, 235.43, 40);
        Product apple = new Product("Яблоко", 4.6, 53.3, 56);

    // tomato == tomato2 -> false, из-за того что создали нью появились ссылки и он сравнивает ссылки
    boolean isEqual = tomato.equals (tomato2); // -> false, потому-что лежат в раных ячейках памяти
    boolean result = tomato.equals("tomato");
    boolean equalsResult = tomato.equals(tomato2);
    boolean hasnCodeResult = tomato.hashCode() ==tomato2.hashCode();
        System.out.println(hasnCodeResult);
    if (tomato.hashCode() == tomato2.hashCode()){
        if (tomato.equals(tomato2)){
            //объекты одинаковы
            }
        }
    }
}

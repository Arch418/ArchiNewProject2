package org.levelup.lesson4.inheritance;

public class Ship extends Transport {

    @Override
    public void go() {
        // super.go(); // переопределили метод
        System.out.println("Корабли ходят! А не плавают!");
    }
}

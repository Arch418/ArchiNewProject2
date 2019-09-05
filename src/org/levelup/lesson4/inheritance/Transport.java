package org.levelup.lesson4.inheritance;

public class Transport {
    String brand;
    int wheelCount;

    public Transport(){
        System.out.println("Transport constructor");
    }
    void go () {
        System.out.println("Transport is going...");
    }
}

package org.levelup.lesson4.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.wheelCount = 4;
        car.go();

        Bus bus = new Bus();
        car.wheelCount = 6;
        bus.setSitsAmount(50);

        Transport transport = new Transport();
        transport.go();

        Ship ship = new Ship();
        ship.go();

        BigShip bigship = new BigShip();
        bigship.go();
    }

    static void printAllTransport(Transport[] transports) {
        for (int i = 1; i < transports.length; i++) {
            System.out.println(transports[i].wheelCount);
        }
    }
}

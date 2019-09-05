package org.levelup.lesson4;

public class Flower {

    //модификатор доступа:
    //private - доступно только в данном классе {}
    //default-package (private-package) - когда не пишу ни чего перед типом (по дефолту ставиться, доступно только в данной папке (lesson4)
    //protected
    //public - можем обращаться из любого класса

    private String name;
    String color; // private-package
    public double weight;
    public void setName (String newName) {
        name = newName;

    }
}

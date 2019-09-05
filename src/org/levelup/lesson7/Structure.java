package org.levelup.lesson7;

public interface Structure {

    // public static final ... - это константа которая доступна всем, но ее нельзя изменить
    // public abstract ... - всегда метод ПУБЛИЧНЫЙ!!!

    void addArray (int[]array);

    void addLast (int value);

    int getSiza();

    boolean isEmpty();


}

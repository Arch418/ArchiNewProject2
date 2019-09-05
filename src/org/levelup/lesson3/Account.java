package org.levelup.lesson3;
//переменная класса, поле класса, field
// пустой класс - 16 байт
// 1 Int - 24 байта
// 1 double - 24 байт
// 2 int - 24 байт
// 3 int - 32 байт
public class Account {
    double amount;
    String fio;

    Account(){
        fio = "Anonymous";
    }
    Account(String newFio, double newAmount) {
        fio = newFio;
        amount = newAmount;
    }
    // increaseAndGet
    //type name(parameters){}
    // parameters - type nameofParameters
    double increaseAndGet(double value) {
        if (value <= 0) {
            return amount; // return конец метода
        }
        amount +=value; // amount = amount + value
        return amount;
    }

        // overloading - перегрузка
    void changerFio(String newFio) {
        // ничего не вернет, но завершит метод, если написать
        fio = newFio;
    }
}

package org.levelup.lesson3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // petrovAccount - объект, экземпляр, ссылка, object, instance, reference
        Account anonymous = new Account();
        System.out.println("FIO: " + anonymous.fio);
        Account petrovAccount = new Account("Petrov", 10);
        //petrovAccount.fio = "Petrov";
        //petrovAccount.amount = 10;

        Account ivanovAccount = new Account();
        ivanovAccount.fio = "Ivanov";
        ivanovAccount.amount = 15;

        System.out.println(petrovAccount.fio + " amount: " + petrovAccount.amount);
        System.out.println(ivanovAccount.fio + " amount: " + ivanovAccount.amount);

        Scanner console = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        double sum = console.nextDouble();
        double result = petrovAccount.increaseAndGet(sum);
        System.out.println("Petrov amount: " + result);

        petrovAccount.changerFio("Petrov Ivan");
        System.out.println("New fio: " + petrovAccount.fio);

    }
}

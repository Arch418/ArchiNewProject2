package org.levelup.lesson2;

import java.util.*;

public class ArchiLesson2GuessNumber {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int secretNumber = randomizer.nextInt(4); //[0-4)
        //int secretNumber = randomizer.nextInt(4) + 4; -> [4,8)
        //int secretNumber = randomizer.nextInt(21) - 10; -> [-10,11)
        Scanner consoleReader = new Scanner (System.in);
        System.out.println("Введите число:");
        int userNumber = consoleReader.nextInt();
            if (secretNumber == userNumber)  {
            System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы не угадали!");
            }
    }
}



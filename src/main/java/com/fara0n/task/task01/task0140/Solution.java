package com.fara0n.task.task01.task0140;

/*
Дана переменная number(она уже создана, к ней можно обращаться по имени с любого места программы).
Напиши программу, которая посчитает квадрат числа переменной number и выведет его на экран

Подсказка:
Квадрат — результат умножения числа на себя (number * number).

Требования:
•	У переменной number можно менять только значение.
•	В программе должен использоваться вывод на экран.
•	Выводимый текст должен быть числом.
•	Выводимый текст должен быть квадратом переменной number.
 */

public class Solution {

    public static int number = 25;

    public static void main(String[] args) {
        calcSquare(number);
    }

    private static void calcSquare(int number) {
        double result = number * number;
        System.out.println(result);
    }
}

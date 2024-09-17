package com.fara0n.task.task01.task0114;

/*
Напиши программу, которая выводит на экран надпись: "JavaRush. Learn once - use anywhere" 10 раз.

Требования:
•	Программа должна выводить текст.
•	Текст должен начинаться с "JavaRush".
•	Текст должен заканчиваться на "use anywhere".
•	Текст должен состоять из 10 строк.
•	Выводимый текст должен соответствовать заданию.
 */

public class Solution {
    public static void main(String[] args) {
        int quantityOfPrints = 10;
        printPhrase(quantityOfPrints);
    }

    private static void printPhrase(int prints) {
        for (int i = 0; i < prints; i++) {
            System.out.println("JavaRush. Learn once - use anywhere");
        }
    }
}

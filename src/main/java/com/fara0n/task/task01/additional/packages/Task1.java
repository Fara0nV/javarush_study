package com.fara0n.task.task01.additional.packages;

public class Task1 {

    private static String TEXT = "Kiss my metal shiny ass"; // ПЕРЕМЕННАЯ КЛАССА

    public static void main(String[] args) {
        System.out.println(TEXT);

        String s = "Ho-ho-ho";

        printTextMoreTimes(s, 3);
    }

    public static void printTextMoreTimes(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}

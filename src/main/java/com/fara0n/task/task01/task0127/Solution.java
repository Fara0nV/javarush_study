package com.fara0n.task.task01.task0127;

/*
Напиши программу, которая выводит на экран квадрат числа 5 с помощью метода sqr.
 */

public class Solution {
    public static void main(String[] args) {
        int result = sqr(5);
        System.out.println(result);
    }

    public static int sqr(int a) {
        return a * a;
    }
}

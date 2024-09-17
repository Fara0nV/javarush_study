package com.fara0n.task.task01.additional.comparing_lang;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        int a, b, c;
        String s1, s2;
        System.out.println("Введіть два числа");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сума двох чисел дорівнює = " + c);
    }
}

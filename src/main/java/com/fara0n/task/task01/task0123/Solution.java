package com.fara0n.task.task01.task0123;

/*
Закомментируй те переменные, которые нигде не используются. Программа должна компилироваться.

Требования:
•	Тип переменных менять нельзя.
•	Значения переменных менять нельзя.
•	В программу нельзя добавлять новые строки или удалять имеющиеся.
•	Нужно закомментировать неиспользуемые переменные.
•	Вывод программы не должен измениться.
 */

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = b + 38;
        //  int d = a + 12;
        // double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //  String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
        System.out.println(s);
    }
}

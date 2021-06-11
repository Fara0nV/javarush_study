package com.fara0n.task.task01.additional.packages;

public class Task2 {

    private static String VENDOR = "BMW";

    public static void main(String[] args) {
        System.out.println(VENDOR);

        String dream = "I'll have this car";
        printMyDreamMoreTimes(dream, 7, VENDOR);
    }

    public static void printMyDreamMoreTimes(String dream, int count, String VENDOR) {
        for (int i = 0; i < count; i++) {
            System.out.println(VENDOR);
            System.out.println(dream);
        }
    }
}

package org.example;

import java.lang.reflect.Array;

public class Lesson_1 {

    public void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public void checkSumSign() {
        int a = 5;
        int b = -5;
        if (a + b < 0)
            System.out.println("Сумма отрицательная");
        else
            System.out.println("Сумма положительная");
    }

    public void printColor() {
        int value = 101;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 100)
            System.out.println("Зеленый");
        else
            System.out.println("Желтый");
    }

    public void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    public boolean checkSumRange(int a, int b) {
        if ((a + b >= 10) && (a + b <= 20))
            return true;
        return false;
    }

    public void definitionSign(int a) {
        System.out.println((a < 0) ? "Отрицательное" : "Положительное");
    }

    public boolean definitionSignBool(int a) {
        return (a < 0) ? true : false;
    }

    public void stringCount(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public boolean definitionYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            return true;
        return false;
    }

    public int[] changeArray(int[] array) {

        for (int i = 0; i > array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
        return array;
    }

}

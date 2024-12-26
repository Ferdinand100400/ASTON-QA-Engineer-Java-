package org.example;

public class Main {
    public static void main(String[] args) {
        Lesson_1 lesson_1 = new Lesson_1();

        lesson_1.printThreeWords();
        lesson_1.checkSumSign();
        lesson_1.printColor();
        lesson_1.compareNumbers();
        System.out.println(lesson_1.checkSumRange(10,-1));
        lesson_1.definitionSign(-10);
        System.out.println(lesson_1.definitionSignBool(0));
        lesson_1.stringCount("test",5);
        System.out.println(lesson_1.definitionYear(500));
        int[] array = {1,0,0,0,1,1};
        System.out.println(lesson_1.changeArray(array));

    }
}
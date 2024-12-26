package Lesson_1;

public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(checkSumRange(10, -1));

        definitionSign(-10);

        System.out.println(definitionSignBool(0));

        stringCount("test", 5);

        System.out.println(definitionYear(500));

        int[] array1 = {1, 0, 0, 0, 1, 1};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            }
            else {
                array1[i] = 0;
            }
            System.out.print(array1[i] + " ");
        }
        System.out.println("");

        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            System.out.print(array2[i] + " ");
        }
        System.out.println("");


        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
            System.out.print(array3[i] + " ");
        }
        System.out.println("");

        int[][] array4 = {{2, 5, 7}, {4, 7, 2}, {7, 9, 3}};
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
            array4[array4.length - i - 1][i] = 1;
        }
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[0].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println("");
        }

        int[] array5 = newArray(5, 10);
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }

    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -5;
        if (a + b < 0)
            System.out.println("Сумма отрицательная");
        else
            System.out.println("Сумма положительная");
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 100)
            System.out.println("Зеленый");
        else
            System.out.println("Желтый");
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    public static boolean checkSumRange(int a, int b) {
        return ((a + b >= 10) && (a + b <= 20));
    }

    public static void definitionSign(int a) {
        System.out.println((a < 0) ? "Отрицательное" : "Положительное");
    }

    public static boolean definitionSignBool(int a) {
        return (a < 0);
    }

    public static void stringCount(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean definitionYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public static int[] newArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

}
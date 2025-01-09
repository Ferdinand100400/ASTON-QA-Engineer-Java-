package Lesson_5_2;

public class Main {

    public static void main(String[] args) {

        GeometricShapes circle = new GeometricShapes("Green", "Black");
        GeometricShapes rectangle = new GeometricShapes("Red", "Black");
        GeometricShapes triangle = new GeometricShapes("Blue", "Black");

        System.out.println("Круг:");
        System.out.println("Периметр: " + circle.perimeter(10));
        System.out.println("Площадь: " + circle.square(10));
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());
        System.out.println(" ");

        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + rectangle.perimeter(5,10));
        System.out.println("Площадь: " + rectangle.square(5,10));
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());
        System.out.println(" ");

        System.out.println("Треугольник:");
        System.out.println("Периметр: " + triangle.perimeter(5, 10, 5));
        System.out.println("Площадь: " + triangle.square(5, 10, 5));
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());
        System.out.println(" ");


    }
}

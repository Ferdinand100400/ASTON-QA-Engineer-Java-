package Lesson_5_2;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10,"Green", "Black");
        Rectangle rectangle = new Rectangle(5, 10, "Red", "Black");
        Triangle triangle = new Triangle(5, 10, 5, "Blue", "Black");

        System.out.println("Круг:");
        System.out.println("Периметр: " + circle.perimeter());
        System.out.println("Площадь: " + circle.square());
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());
        System.out.println(" ");

        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + rectangle.perimeter());
        System.out.println("Площадь: " + rectangle.square());
        System.out.println("Цвет заливки: " + rectangle.getFillColor());
        System.out.println("Цвет границы: " + rectangle.getBorderColor());
        System.out.println(" ");

        System.out.println("Треугольник:");
        System.out.println("Периметр: " + triangle.perimeter());
        System.out.println("Площадь: " + triangle.square());
        System.out.println("Цвет заливки: " + triangle.getFillColor());
        System.out.println("Цвет границы: " + triangle.getBorderColor());
        System.out.println(" ");


    }
}

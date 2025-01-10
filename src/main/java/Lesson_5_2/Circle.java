package Lesson_5_2;

public class Circle implements GeometricShapes {
    private String fillColor;
    private String borderColor;
    private double radius;
    private static final double pi = 3.14;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double square() {
        return pi * radius * radius;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}

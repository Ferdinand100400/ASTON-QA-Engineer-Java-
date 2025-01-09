package Lesson_5_2;

import static java.lang.Math.sqrt;

public class GeometricShapes implements Circle, Rectangle, Triangle {
    private String fillColor;
    private String borderColor;
    private static final double pi = 3.14;

    public GeometricShapes(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter(double r) {
        return 2 * pi * r;
    }

    @Override
    public double square(double r) {
        return pi * r * r;
    }

    @Override
    public double perimeter(double a, double b) {
        return 2 * (a + b);
    }

    @Override
    public double square(double a, double b) {
        return a * b;
    }

    @Override
    public double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    @Override
    public double square(double a, double b, double c) {
        return sqrt(perimeter(a, b, c) * ((perimeter(a, b, c) - a) * (perimeter(a, b, c) - b) * (perimeter(a, b, c) - c)));
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}

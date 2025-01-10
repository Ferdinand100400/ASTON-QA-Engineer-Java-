package Lesson_5_2;

import static java.lang.Math.sqrt;

public class Triangle implements GeometricShapes {
    private String fillColor;
    private String borderColor;
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double square() {
        return sqrt(perimeter() * ((perimeter() - a) * (perimeter() - b) * (perimeter() - c)));
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}

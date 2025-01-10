package Lesson_5_2;

public class Rectangle implements GeometricShapes {
    private String fillColor;
    private String borderColor;
    private double a;
    private double b;

    public Rectangle(double a, double b, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public double square() {
        return a * b;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}

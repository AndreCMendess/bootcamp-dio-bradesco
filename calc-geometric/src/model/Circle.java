package model;
public record Circle(double radio) implements GeometricForm {
    private static final double pi = 3.14;

    @Override
    public double getArea() {
        return pi * (radio * radio);
    }
}

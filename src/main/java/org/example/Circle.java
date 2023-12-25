package org.example;

public class Circle extends Figure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        double circleSurface = Math.PI*radius*radius;
        return circleSurface;
    }
}

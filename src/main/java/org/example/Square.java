package org.example;

public class Square extends Figure{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateSurface() {
        double squareSurface = side*side;
        return squareSurface;
    }
}

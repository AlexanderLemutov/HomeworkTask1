package org.example;

public class Triangle extends Figure{
    double sideOne;
    double sideTwo;
    double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double calculateSurface() {
        double halfPerimeter = (sideOne + sideTwo + sideThree)/2;
        double triangleSurface = Math.sqrt(halfPerimeter*(halfPerimeter-sideOne)*(halfPerimeter-sideTwo)*(halfPerimeter-sideThree));
        return triangleSurface;
    }
}

package org.example;

public class Matematik {
    public Matematik() {
    }

    public void calculateSquareSurface(double side){
        if (side < 0){
            System.out.println("Сторона квадрата должна быть неотрицательной. Невозможно вычислить площадь квадрата с текущим значением стороны квадрата.");
        } else {
            Square square1 = new Square(side);
            System.out.println("Площадь квадрата со стороной " + square1.side + ": " + square1.calculateSurface());
        }
    }

    public void calculateCircleSurface(double radius){
        if (radius < 0) {
            System.out.println("Радиус круга должен быть неотрицательным. Невозможно вычислить площадь круга с текущим значением радиуса круга.");
        } else {
            Circle circle1 = new Circle(radius);
            System.out.println("Площадь круга с радиусом " + circle1.radius + ": " + circle1.calculateSurface());
        }
    }

    public void calculateTriangleSurface(double sideOne, double sideTwo, double sideThree){
        if ((sideOne > sideTwo+sideThree) | (sideTwo > sideOne+sideThree) | (sideThree > sideOne+sideTwo)) {
            System.out.println("Значение сторон не удовлетворяют неравенству треугольника. Каждая сторона треугольника должна быть меньше суммы двух других. Невозможно вычислить площадь треугольника с текущими значениями сторон треугольника.");
        } else {
            Triangle triangle1 = new Triangle(sideOne, sideTwo, sideThree);
            System.out.println("Площадь треугольника со сторонами " + triangle1.sideOne + " " + triangle1.sideTwo + " " + triangle1.sideThree + ": " + triangle1.calculateSurface());
        }
    }
}

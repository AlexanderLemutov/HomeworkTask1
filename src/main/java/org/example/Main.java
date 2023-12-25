package org.example;
public class Main {
    public static void main(String[] args) {
        Matematik beginnerMatematik = new Matematik();
        beginnerMatematik.calculateSquareSurface(5);
        beginnerMatematik.calculateCircleSurface(5);
        beginnerMatematik.calculateTriangleSurface(3, 4, 5);
    }
}
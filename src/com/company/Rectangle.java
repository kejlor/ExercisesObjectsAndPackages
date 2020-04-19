package com.company;

public class Rectangle {

    double length;
    double width;

// Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość. Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double fieldOfRectangle() {
        return length * width;
    }

    double circuitOfRectangle() {
        return length + length + width + width;
    }

    double diagonalOfRectangle() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}

package com.shukevich.expresscourse;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // абстрактный метод для вычисления площади
    abstract double area();
}

// Клас Треугольник
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределяем метод
    double area() {
        return dim1 * dim2 / 2;
    }
}
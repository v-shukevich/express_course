package com.shukevich.expresscourse;

class Box {
    int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки

    // Конструктор
    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    // Второй конструктор
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    // Третий конструктор для куба
    Box(int len) {
        width = height = depth = len;
    }

    // Используем объект типа Box
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // вычисляем объём коробки
    int getVolume() {
        return width * height * depth;
    }

    // устанавливаем размеры коробки
    void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
}
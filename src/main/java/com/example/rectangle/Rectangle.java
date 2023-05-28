package com.example.rectangle;

public class Rectangle {
    // в классе прямоугольник нет данных, которые бы задавали угол его отклонения от какой-либо оси.
    // поэтому представим, что он расположен горизонтально
    private double width; // ширина прямоугольника (расстояние между правой и левой сторонами)
    private double height; // высота прямоугольника (расстояние между верхней стороной и нижней)

    public Rectangle(double w, double h) { // конструктор с двумя параметрами: шириной и высотой
        setWidth(w);
        setHeight(h);
    }

    public void setHeight(double h) throws IllegalArgumentException { // задаем новую высоту прямоугольника
        if (h > 0) {
            height = h;
        }
        else {
            throw new IllegalArgumentException("Высота прямоугольника должна быть больше нуля");
        }
    }

    public void setWidth(double w) throws IllegalArgumentException { // задаем новую ширину прямоугольника
        if (w > 0) {
            width = w;
        }
        else {
            throw new IllegalArgumentException("Ширина прямоугольника должна быть больше нуля");
        }
    }

    public double getHeight() { // возвращает высоту
        return height;
    }

    public double getWidth() { // возвращает ширину
        return width;
    }

    public double getPerimeter() { // вычисление периметра и возвращение этого периметра
        return height*2 + width*2;
    }

    // вычисление площади и ее возврат
    public double getSquare() {
        return height * width;
    }
}

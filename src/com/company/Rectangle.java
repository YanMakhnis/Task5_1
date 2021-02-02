package com.company;

public class Rectangle {

    double x;
    double y;
    double sqr;

    private static int createdRectangles = 0;
    private final String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final String ENGLISH_CLASS_NAME = "Rectangle";


    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;

    }

    public double calculateArea() {
        return sqr = x * y;
    }

    public void printArea() {
        System.out.println("Площадь равна " + calculateArea());
    }

    public void printRectangleKind() {
        if (x != y) {
            System.out.println("Это прямоугольник");
        } else {
            System.out.println("Это квадрат");
        }
    }

    public int getCreatedRectangles() {
        return createdRectangles++;
    }

    public boolean isTheSameRectangle(Rectangle rectangle) {
        if (this.x == rectangle.x && this.y == rectangle.y) {
            return true;
        } else {
            return false;
        }

    }

    public static void printRectanglesCount() {
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }

}


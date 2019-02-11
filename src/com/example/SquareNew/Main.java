//2). Создать интерфейс с методом  площадь и реализовать
// его в классах: прямоугольник, круг, прямоугольный треугольник,
// трапеция со своими.
//Для проверки определить массив ссылок на интерфейс,
// которым присваиваются различные объекты.
//Площадь трапеции:S=(a+b)h/2
package com.example.SquareNew;

public class Main {

    public static void main(String[] args) {
        SquareNew[] mas = new SquareNew[4];
        mas[0] = new Circle(5);
        mas[1] = new Rectangle(10);
        mas[2] = new Trapezoid(5, 6, 7);
        mas[3] = new RightTriangle(15, 12);
        for (SquareNew area : mas) {
            area.allSquare();
        }
    }
}

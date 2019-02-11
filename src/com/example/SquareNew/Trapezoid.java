package com.example.SquareNew;

public class Trapezoid implements SquareNew {
    private  int a,b,h;

    public Trapezoid(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
}
    public void allSquare() {
        String square = " Трапеции ";
        System.out.println(" Площадь "+ square +" = "+ ((a+b)*h)/2);

    }
}

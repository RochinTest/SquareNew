package com.example.SquareNew;

import java.text.DecimalFormat;

public class Circle implements SquareNew{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void allSquare() {
        DecimalFormat count = new DecimalFormat("#0.00");
        String square = " Окружности";
        System.out.println( " Площадь "+ square +" = "+ count.format(Math.PI*radius));

    }
}

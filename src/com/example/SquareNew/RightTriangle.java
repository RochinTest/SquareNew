package com.example.SquareNew;

import java.text.DecimalFormat;

public class RightTriangle implements SquareNew {
    private double sideA;
private   double sideB;

    public RightTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void allSquare() {
        DecimalFormat count = new DecimalFormat("#0.00");
        if (sideA > sideB) {
            String square = "Треугольника ";
            System.out.println(" Площадь " + square + " = "+count.format( sideB / 4 * (Math.sqrt((4 * (sideA * sideA)) - (sideB * sideB)))));
        } else {
            System.out.println(" Сторона А не может быть меньше В");

        }
    }}

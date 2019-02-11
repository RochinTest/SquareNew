package com.example.SquareNew;

public class Rectangle implements SquareNew{
    private int side;

    public Rectangle(int side) {
        this.side = side;

    }

    public void allSquare() {
        String sguare = "Квадрата";
        System.out.println(" Площадь " + sguare +" = " + side*side);
    }
}

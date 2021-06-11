package com.codersbay.gerhofer;

public class Circle extends Shape {
        int radius;

    public Circle(String color,int radius, boolean isFilled) {
        super(color, isFilled);
        if (radius<=0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*3.14;
    }
}


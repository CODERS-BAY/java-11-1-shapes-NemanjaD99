package com.codersbay.gerhofer;

import com.codersbay.gerhofer.Shape;

public class Rectangle extends Shape {
    int width;
    int length;
    String getArea;
    String getPerimeter;

    public Rectangle(String color,int width,int length,boolean isFilled) {
        super(color, isFilled);
        if (width<=0||length<=0){
            throw new IllegalArgumentException();
        }
    }


    public double getArea(){
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
}

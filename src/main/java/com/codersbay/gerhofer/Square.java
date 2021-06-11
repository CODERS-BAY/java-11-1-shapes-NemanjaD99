package com.codersbay.gerhofer;

import com.codersbay.gerhofer.Shape;

public class Square extends Shape {
    int side;

    public Square(String color,int side, boolean isFilled) {
        super(color, isFilled);
        if (side<=0){
            throw new IllegalArgumentException();
        }
        this.side=side;
    }

    public double getArea(){
        return 6*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }
}

package com.codersbay.gerhofer;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    @Test
public void testSquarePeremiter()throws IOException{
       Square square =new Square("red",15,true);
       assertEquals(square.getPerimeter(),60);
       assertEquals(square.getArea(),90);}


public void testCirleperemiter()throws  IOException{
Circle circle=new Circle("purple",45,true);
assertEquals(circle.getPerimeter(),282);
assertEquals(circle.getArea(),2025);
    }

    public void Rectangle()throws IOException{
Rectangle rectangle=new Rectangle("green",2,3,true);
assertEquals(rectangle.getPerimeter(),10);
assertEquals(rectangle.getArea(),6);
    }
}

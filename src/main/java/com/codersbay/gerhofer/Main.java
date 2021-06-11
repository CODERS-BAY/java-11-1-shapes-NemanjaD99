package com.codersbay.gerhofer;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Shapes");
        System.out.println(Math.PI);

        List<Shape>allShape=new ArrayList<>();
        Circle kreis =new Circle("black",5,true);
        Rectangle Rechteck =new Rectangle("blue",6,5,false);

    }

}

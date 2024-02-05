package com.teachmeskills.lesson7_hw.task_2.impl;
/**
 * This class implements the methods from BaseFigure for a rectangle
 **/
public class Rectangle extends BaseFigure {

    public double length;

    public double width;

    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return (width+length)*2;
    }
}

package com.teachmeskills.lesson7_hw.task_2.impl;
/**
 * This class implements the methods from BaseFigure for a circle
 **/
public class Circle extends BaseFigure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

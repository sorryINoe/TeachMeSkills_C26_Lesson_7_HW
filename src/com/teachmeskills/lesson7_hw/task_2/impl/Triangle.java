package com.teachmeskills.lesson7_hw.task_2.impl;
/**
 * This class implements the methods from BaseFigure for a triangle
 **/
public class Triangle extends  BaseFigure{

    public double aSide;
    public double bSide;
    public double cSide;

    public Triangle(double aSide,double bSide,double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.name = "Triangle";
    }

    @Override
    public double calculateArea() {
        double area;
        area = ((aSide+bSide+cSide)/2)*((aSide+bSide+cSide)/2-aSide)*((aSide+bSide+cSide)/2-bSide)
                *((aSide+bSide+cSide)/2-cSide);
        return Math.sqrt(area);
    }

    @Override
    public double calculatePerimeter() {
        return aSide+bSide+cSide;
    }
}

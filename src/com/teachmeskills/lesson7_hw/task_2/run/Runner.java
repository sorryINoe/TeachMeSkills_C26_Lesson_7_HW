package com.teachmeskills.lesson7_hw.task_2.run;

import com.teachmeskills.lesson7_hw.task_2.impl.BaseFigure;
import com.teachmeskills.lesson7_hw.task_2.impl.Circle;
import com.teachmeskills.lesson7_hw.task_2.impl.Rectangle;
import com.teachmeskills.lesson7_hw.task_2.impl.Triangle;

public class Runner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4.5,5.1,6.7);
        Rectangle rectangle1 = new Rectangle(1.2,4.2);
        Rectangle rectangle2 = new Rectangle(2.0,2.0);
        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle(3.2);

        BaseFigure[] figures = new BaseFigure[5];
        figures[0]= triangle;
        figures[1]= rectangle1;
        figures[2]= rectangle2;
        figures[3]= circle1;
        figures[4]= circle2;

        double generalPerimeter = 0.0;

        for (BaseFigure figure: figures ){

            double figurePerimeter = figure.calculatePerimeter();
            System.out.println( "\n" + "Figure: " + figure.name + "\n" + "Area: " + figure.calculateArea() + "\n"
                    + "Perimeter: " + figure.calculatePerimeter() + "\n" +  "-------------------------");
            generalPerimeter = generalPerimeter + figurePerimeter;

        }
        System.out.println("GeneralPerimeter: " + generalPerimeter);
    }
}

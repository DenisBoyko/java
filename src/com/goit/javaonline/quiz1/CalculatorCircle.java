package com.goit.javaonline.quiz1;
import java.lang.Math;

public class CalculatorCircle {

    double circleAnswer;
    private double radius;
    public String answer = "Circle square is ";

    public double calculationCircle(){
        circleAnswer = Math.PI * Math.pow((radius),2);
        return circleAnswer ;
    }


    // Set - Get
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

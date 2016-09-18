package com.goit.javaonline.quiz1;


public class CalculatorTriangle {
    double triangleAnswer;
    private double heightTriangle;
    private double bottomTriangle;
    public String answer = "Triangle Square is ";

    public double calculationTriangle(){
        triangleAnswer = (getHeightTiangle()* getBottomTriangle()) * 0.5;
        return triangleAnswer ;
    }


    // Set - Get

    public double getHeightTiangle() {


        return heightTriangle;
    }

    public void setHeightTiangle(double heightTiangle) {
        this.heightTriangle = heightTiangle;
    }

    public double getBottomTriangle() {
        return bottomTriangle;
    }

    public void setBottomTriangle(double bottomTriangle) {
        this.bottomTriangle = bottomTriangle;

    }
}
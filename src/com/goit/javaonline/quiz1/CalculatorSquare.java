package com.goit.javaonline.quiz1;

public class CalculatorSquare {
        double squareAnswer;
        private double sideA;
        private double sideB;
        public String answer = "Rectangle Square is ";

        public double calculationSquare(){
            squareAnswer = (getSideA() * getSideB());
            return squareAnswer ;
        }

    // Set - Get

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

}

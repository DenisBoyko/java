package com.goit.javaonline;

import com.goit.javaonline.quiz1.CalculatorCircle;
import com.goit.javaonline.quiz1.CalculatorSquare;
import com.goit.javaonline.quiz1.CalculatorTriangle;
import com.goit.javaonline.quiz2.TempCelsiusFahrenheit;
import com.goit.javaonline.quiz3.DistancePoint;

public class main {
    public static void main(String[] args) {
        //Quiz 1
        //Calculating of Triangle Square
        CalculatorTriangle calculatorTriangle = new CalculatorTriangle();
        calculatorTriangle.setHeightTiangle(35);        //Input height of Tiangle
        calculatorTriangle.setBottomTriangle(89);       //Input bottom of Tiangle
        System.out.println(calculatorTriangle.answer + calculatorTriangle.calculationTriangle());

        //Calculating of Rectangle Square
        CalculatorSquare calculatorSquare = new CalculatorSquare();
        calculatorSquare.setSideA(12.5);                //Input lengths of 1st side of Square
        calculatorSquare.setSideB(25);                  //Input lengths of 2nd side of Square
        System.out.println(calculatorSquare.answer + calculatorSquare.calculationSquare());

        //Calculating of Circle Square
        CalculatorCircle calculatorCircle = new CalculatorCircle();
        calculatorCircle.setRadius(2);                  //Input radius of Circle
        System.out.println(calculatorCircle.answer + calculatorCircle.calculationCircle());


        //Quiz 2
        //Conversion Celsius to Fahrenheit
        TempCelsiusFahrenheit tempCelsiusFahrenheit = new TempCelsiusFahrenheit();
        tempCelsiusFahrenheit.setCelsius(56);
        System.out.println(tempCelsiusFahrenheit.answer + tempCelsiusFahrenheit.calculatingCilsiusToFahrenheit());


        //Conversion Fahrenheit to Celsius
        TempCelsiusFahrenheit tempFahrenheitCelsius = new TempCelsiusFahrenheit();
        tempFahrenheitCelsius.setFahrenheit(568);
        System.out.println(tempFahrenheitCelsius.answer + tempFahrenheitCelsius.calculatingFahrenheitToCilsius());


        //Quiz 3
        //Calculation of distance between two points
        DistancePoint distancePoint = new DistancePoint();
        distancePoint.setX1(15);
        distancePoint.setY1(15);
        distancePoint.setX2(10);
        distancePoint.setY2(10);
        System.out.println(distancePoint.answer + distancePoint.distanePoint());


    }
}

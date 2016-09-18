package com.goit.javaonline.quiz2;

public class TempCelsiusFahrenheit {
    private double celsius;
    private double fahrenheit;
    double answerCelsium;
    double answerFahrenheit;
    final static double constantForCelsium = 1.8;
    final static double constantForFahrenheit = 0.55555555555555555555555555555556;
    final static double commonConstant = 32;
    public String answer = "The Temp is ";

    public double calculatingCilsiusToFahrenheit(){
        answerCelsium = getCelsius() * constantForCelsium + commonConstant;
        return answerCelsium;
    }

    public double calculatingFahrenheitToCilsius(){
        answerFahrenheit = (getFahrenheit() - commonConstant) * constantForFahrenheit;
        return answerFahrenheit;
    }




    // Set - Get


    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}

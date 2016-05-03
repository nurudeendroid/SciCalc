package io.nurudeenlawal;

/**
 * Created by nurudeenlawal on 4/30/16.
 */
public class BasicCalc {
    /**
     *The basic mathematical methodology
     */
    public double sum(double value1, double value2){ return value1 + value2; }
    public double dif(double value1, double value2){ return value1 - value2; }
    public double prod(double value1, double value2){ return value1 * value2; }
    public double div(double value1, double value2){ return value1 / value2; }
    public double square(double value){ return value * value; }
    public double cube(double value){return value * value * value;}
    public double toExp(double value1, double value2){return Math.pow(value1,value2);}
    public double squareRoot(double value){ return Math.sqrt(value) ;}
    public double inverse(double value){ return (1.0/value) ;}
}

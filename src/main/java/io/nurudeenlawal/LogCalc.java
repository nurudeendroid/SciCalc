package io.nurudeenlawal;

/**
 * Created by nurudeenlawal on 4/30/16.
 */

/**
 * The logorithmic math methods
 */
public class LogCalc {
    public double log(double value){return Math.log10(value);}
    public double invLog(double value){ return Math.pow(10.0,value) ;}
    public double natLog(double value){ return (Math.log(value)) ;}
    public double invNatLog(double value){ return Math.pow(Math.E,value) ;}
}

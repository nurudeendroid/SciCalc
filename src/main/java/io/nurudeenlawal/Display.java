package io.nurudeenlawal;

/**
 * Created by nurudeenlawal on 4/30/16.
 */
public class Display {
    //public int display = 1;
    public double decimalDisplay = 0;
    public String display;
    public int displayForCalc;
    public String binaryDisplay = Integer.toBinaryString(displayForCalc);
    public String octalDisplay = Integer.toOctalString(displayForCalc);
    public String hexDisplay = Integer.toHexString(displayForCalc);

    /*public void switchDisplay() {
        switch (display) {
            case 1:
                System.out.println(decimalDisplay);
                break;
            case 2:
                System.out.println(binaryDisplay);
                break;
            case 3:
                System.out.println(octalDisplay);
                break;
            case 4:
                System.out.println(hexDisplay);
                break;
        }
    }
    public void switchUnits(){

    }*/
}

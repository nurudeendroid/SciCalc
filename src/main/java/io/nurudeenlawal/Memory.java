package io.nurudeenlawal;
import io.nurudeenlawal.Display;
/**
 * Created by nurudeenlawal on 4/30/16.
 */
public class Memory {
    Display display = new Display();
    public int lastValue = 0;
    public void clearMemory(){
        lastValue = 0;
    }
    public void recallLast(){
        System.out.println(lastValue);
        display.decimalDisplay = lastValue;
    }
    public void memoryPlus(){
        System.out.println(lastValue + display.decimalDisplay);
        display.decimalDisplay += lastValue;
        System.out.println(display.decimalDisplay);
    }
}

package io.nurudeenlawal;

import java.util.Scanner;

/**
 * Created by nurudeenlawal on 4/30/16.
 */
public class Calculator {
    public void setDecimalDisplay() {
        Input input = new Input();
        Display display = new Display();
        display.decimalDisplay = input.numberInput();
    }

    /**
     * Handles the command input and stopping the calculator
     */
    public String commandEntered;
    public boolean off = false;
    public boolean needCommand = false;
    public void mathOp() {
        /**
         * This initiates the other classes
         */
        Input input = new Input();
        Display display = new Display();
        BasicCalc basicCalc = new BasicCalc();
        TrigCalc trigCalc = new TrigCalc();
        LogCalc logCalc = new LogCalc();
        Memory memory = new Memory();

        while (!off) {

            if (!needCommand) {
                display.decimalDisplay = input.numberInput();
                needCommand = true;
            }
                commandEntered = input.mathInput().toUpperCase();

            Ops ops = Ops.valueOf(commandEntered);
            System.out.println(display.decimalDisplay);
            /**
             * Switch to handle the input commands for mathematical functions
              */
        switch (ops) {
            case ADD:
                display.decimalDisplay = basicCalc.sum(display.decimalDisplay, input.numberInput());
                break;
            case SUB:
                display.decimalDisplay = basicCalc.dif(display.decimalDisplay, input.numberInput());
                break;
            case DIV:
                display.decimalDisplay = basicCalc.div(display.decimalDisplay, input.numberInput());
                break;
            case MULT:
                display.decimalDisplay = basicCalc.prod(display.decimalDisplay, input.numberInput());
                break;
            case SQR:
                display.decimalDisplay = basicCalc.square(display.decimalDisplay);
                break;
            case CUBE:
                display.decimalDisplay = basicCalc.cube(display.decimalDisplay);
                break;
            case TOEXP:
                display.decimalDisplay = basicCalc.toExp(display.decimalDisplay, input.numberInput());
                break;
            case ROOT:
                display.decimalDisplay = basicCalc.squareRoot(display.decimalDisplay);
                break;
            case INV:
                display.decimalDisplay = basicCalc.inverse(display.decimalDisplay);
                break;
            case SIN:
                display.decimalDisplay = trigCalc.sine(display.decimalDisplay);
                break;
            case COS:
                display.decimalDisplay = trigCalc.coSine(display.decimalDisplay);
                break;
            case TAN:
                display.decimalDisplay = trigCalc.tangent(display.decimalDisplay);
                break;
            case INSIN:
                display.decimalDisplay = trigCalc.invSine(display.decimalDisplay);
                break;
            case INCOS:
                display.decimalDisplay = trigCalc.invCosine(display.decimalDisplay);
                break;
            case INTAN:
                display.decimalDisplay = trigCalc.invTangent(display.decimalDisplay);
                break;
            case LOG:
                display.decimalDisplay = logCalc.log(display.decimalDisplay);
                break;
            case INLOG:
                display.decimalDisplay = logCalc.invLog(display.decimalDisplay);
                break;
            case NATLOG:
                display.decimalDisplay = logCalc.natLog(display.decimalDisplay);
                break;
            case INNATLOG:
                display.decimalDisplay = logCalc.natLog(display.decimalDisplay);
                break;
            case TOTALRECALL:
                 memory.recallLast();
                break;
            case EXIT:
                off = true;
                break;
            case MEM:
                memory.memoryPlus();
                break;
            case CLEAR:
                memory.clearMemory();
                break;
            default:
                System.out.println("Error");
                break;


        }

        }
        }
        }

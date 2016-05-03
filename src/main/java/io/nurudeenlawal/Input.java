package io.nurudeenlawal;

import java.util.Scanner;

/**
 * Created by nurudeenlawal on 5/1/16.
 */
public class Input {
    /**
     * This is built to take the number input &
     * @return it for mathematical use
     */
    public int numberInput() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input a number");
        return input1.nextInt();
    }

    /**
     *This is built to take the input that decides which math method to
     * @return
     */
    public String mathInput(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("What are you trying to do ");
        System.out.println("Here are your options: ");
        System.out.println("ADD, SUB, MULT, DIV, SQR, CUBE, TOEXP, ROOT, INV ");
        System.out.println("SIN, COS, TAN, INSIN, INCOS, INTAN");
        System.out.println("LOG, INLOG, NATLOG, INNATLOG ,  or EXIT");
        return input2.next();
    }
}

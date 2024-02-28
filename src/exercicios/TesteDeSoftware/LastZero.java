package exercicios.TesteDeSoftware;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LastZero {
    // Introduction to Software Testing
    // Authors: Paul Ammann & Jeff Offutt
    // Chapter 1, section 1.2, page 16

    public static int lastZero(int[] x) { // Effects: if x==null throw
        // NullPointerException
        // else return the index of the LAST
        // 0 in x.
        // Return -1 if 0 does not occur in
        // x

        for (int i = 0; i <= x.length; i++) {
            if (x[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    // test: x=[0, 1, 0]
    // Expected = 2
    public static int divisao(int n, int d) {
        try {
            return n / d;
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    public static String diga(){
        return "ola";
    }

    public static String olaDemorado(){
        try {

            new Thread().sleep(2000);

        } catch (InterruptedException ex) {
            System.out.println("Erro.");
        }
        return "Ola";
    }
}
package task4.tests;

import org.junit.jupiter.api.Test;
import task4.calculator.Function;
import task4.calculator.ICalculator;
import task4.calculator.logarithmic.*;
import task4.calculator.trigonometric.*;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class Tests {
    protected final double eps = 10e-5; //10e-6;

    // logarithmic:
    protected ICalculator log;
    protected ICalculator log2;
    protected ICalculator funLog;

    // trigonometric:
    protected ICalculator sin;
    protected ICalculator cos;
    protected ICalculator tan;
    protected ICalculator sec;
    protected ICalculator csc;
    protected ICalculator funTrg;

    // main function:
    protected ICalculator fun;

    protected String message(double x, double y1, double y2) {
        return String.format("x = %f, y1 = %f, y2 = %f", x, y1, y2);
    }
}

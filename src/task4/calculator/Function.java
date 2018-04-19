package task4.calculator;

import task4.calculator.logarithmic.*;
import task4.calculator.trigonometric.*;

public class Function extends Pow implements ICalculator {

    // trigonometric:
    private Sin sin;
    private Cos cos;
    private Tan tan;
    private Sec sec;
    private Csc csc;

    // logarithmic:
    private Log log;
    private Log log2;

    @Override
    public double calc(double x) {
        if (x <= 0)
            return ((((tan.calc(x) + csc.calc(x)) * csc.calc(x)) / csc.calc(x)) * sec.calc(x)) - (tan.calc(x) * tan.calc(x));
        else
            return pow(pow(((log.calc(x) / log2.calc(x)) / log2.calc(x)), 3), 2) - log2.calc(x);
    }
}

package task4.calculator.trigonometric;

import task4.calculator.ICalculator;

public class FunTrg implements ICalculator {
    private ICalculator tan;
    private ICalculator sec;
    private ICalculator csc;

    public FunTrg(ICalculator tan, ICalculator sec, ICalculator csc) {
        this.tan = tan;
        this.sec = sec;
        this.csc = csc;
    }

    @Override
    public double calc(double x) {
        return ((((tan.calc(x) + csc.calc(x)) * csc.calc(x)) / csc.calc(x)) * sec.calc(x)) - (tan.calc(x) * tan.calc(x));
    }
}

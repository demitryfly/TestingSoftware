package task4.calculator.logarithmic;

import task4.calculator.ICalculator;
import task4.calculator.Pow;

public class FunLog extends Pow implements ICalculator {
    private ICalculator log;
    private ICalculator log2;

    public FunLog(ICalculator log, ICalculator log2) {
        this.log = log;
        this.log2 = log2;
    }

    @Override
    public double calc(double x) {
        return pow(pow(((log.calc(x) / log2.calc(x)) / log2.calc(x)), 3), 2) - log2.calc(x);
    }
}

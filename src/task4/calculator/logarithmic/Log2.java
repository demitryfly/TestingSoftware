package task4.calculator.logarithmic;

import task4.calculator.ICalculator;
import task4.calculator.logarithmic.Log;

public class Log2 implements ICalculator {
    private ICalculator customLog;

    public Log2(ICalculator customLog) {
        this.customLog = customLog;
    }

    @Override
    public double calc(double x) {
        return customLog.calc(x) / customLog.calc(2);
    }
}

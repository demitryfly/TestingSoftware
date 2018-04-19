package task4.calculator.trigonometric;

import task4.calculator.ICalculator;
import task4.calculator.trigonometric.Cos;
import task4.calculator.trigonometric.Sin;

public class Tan implements ICalculator {
    private Sin customSin;
    private Cos customCos;

    @Override
    public double calc(double x) {
        return customSin.calc(x) / customCos.calc(x);
    }
}

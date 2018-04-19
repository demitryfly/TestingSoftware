package task4.calculator.trigonometric;

import task4.calculator.ICalculator;

public class Csc implements ICalculator {
    private Sin customSin;

    @Override
    public double calc(double x) {
        return 1 / customSin.calc(x);
    }
}

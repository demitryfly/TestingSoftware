package task4.calculator.trigonometric;

import task4.calculator.ICalculator;

public class Cos implements ICalculator {
    private ICalculator customSin;

    public Cos(ICalculator customSin) {
        this.customSin = customSin;
    }

    @Override
    public double calc(double x) {
        return customSin.calc(x + Math.PI / 2);
    }
}

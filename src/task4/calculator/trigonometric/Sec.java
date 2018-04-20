package task4.calculator.trigonometric;

import task4.calculator.ICalculator;
import task4.calculator.trigonometric.Cos;

public class Sec implements ICalculator {
    private ICalculator customCos;

    public Sec(ICalculator customCos) {
        this.customCos = customCos;
    }

    @Override
    public double calc(double x) {
        return 1 / customCos.calc(x);
    }
}

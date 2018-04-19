package task4.calculator.trigonometric;

import task4.calculator.ICalculator;
import task4.calculator.Sign;

public class Sin extends Sign implements ICalculator {

    private double calculateSin(double x) {
        assert 0 <= x && x < Math.PI / 2;

        double sum = 0;
        int fac = 1;

        for (int i = 1; i < 15; ++i) {
            fac *= i;
            if (0 == i % 2)
                continue;

            sum += getSign(i / 2) * Math.pow(x, i) / fac;
        }

        return sum;
    }

    @Override
    public double calc(double x) {
        int sign = 1;
        if (x < 0) {
            x *= -1;
            sign = -1;
        }
        x %= 2 * Math.PI;
        int k = (int)(2 * x / Math.PI);
        x %= Math.PI;

        if (0 != k % 2) {
            k--;
            x = Math.PI - x;
        }
        return sign * getSign(k / 2) * calculateSin(x);
    }
}

package task4.calculator.logarithmic;

import task4.calculator.ICalculator;
import task4.calculator.Sign;

public class Log extends Sign implements ICalculator {

    private double calculateLn(double x) {
        // return: ln(1 + x)
        assert Math.abs(x) < 1;

        double sum = 0.;
        int n = 15;
        for (int i = 1; i < n; ++i)
            sum += getSign(i + 1) / i * Math.pow(x, i);

        return sum;
    }

    private double calcucateLn1(double x) {
        // return: ln(x / (x - 1))
        assert Math.abs(x) > 1;

        double sum = 0.;
        int n = 111;
        for (int i = 1; i < n; ++i)
            sum += 1 / (i * Math.pow(x, i));

        return sum;
    }

    @Override
    public double calc(double x) {
        if (Math.abs(x - 1) < 1) {
            //System.out.println("abs(x-1) < 1");
            return calculateLn(x - 1);
        }
        else {
            //System.out.println("abs(x-1) >= 1");
            return calcucateLn1(x/(x-1));
        }
    }
}

package task4.calculator;

public class Pow {

    protected double pow(double x, int n) {
        double res = 1;
        for (int i = 0; i < n; ++i)
            res *= x;
        return res;
    }
}

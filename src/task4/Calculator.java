package task4;

import java.util.Vector;

public class Calculator {

    private int getSign(int n) {
        return 0 == n % 2 ? 1 : -1;
    }

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

    public double getSin(double x, boolean custom) {
        if (custom)
            return getSin(x);
        else
            return Math.sin(x);
    }

    public double getSin(double x) {
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

    public double getCos(double x, boolean custom) {
        if (custom)
            return getCos(x);
        else
            return Math.cos(x);
    }

    public double getCos(double x) {
        return getSin(x + Math.PI / 2);
    }

    public double getLn(double x, boolean custom) {
        if (custom)
            return Math.log(x);
        else
            return getLn(x);
    }

    public double getLn(double x) {
        if (Math.abs(x - 1) < 1) {
            //System.out.println("abs(x-1) < 1");
            return calculateLn(x - 1);
        }
        else {
            //System.out.println("abs(x-1) >= 1");
            return calcucateLn1(x/(x-1));
        }
    }

    public double getLog_2(double x, boolean custom) {
        if (custom)
            return getLog_2(x);
        else
            return Math.log(x) / Math.log(2);
    }

    public double getLog_2(double x) {
        return getLn(x) / getLn(2);
    }

    public double getTan(double x, boolean custom) {
        if (custom)
            return getTan(x);
        else
            return Math.tan(x);
    }

    public double getTan(double x) {
        return getSin(x) / getCos(x);
    }

    public double getCsc(double x, boolean custom) {
        if (custom)
            return getCsc(x);
        else
            return 1 / Math.sin(x);
    }

    public double getCsc(double x) {
        return 1 / getSin(x);
    }

    public double getSec(double x, boolean custom) {
        if (custom)
            return getSec(x);
        else
            return 1 / Math.cos(x);
    }

    public double getSec(double x) {
        return 1 / getCos(x);
    }

    public double getPow(double x, int n, boolean custom) {
        if (custom)
            return getPow(x, n);
        else
            return Math.pow(x, n);
    }

    public double getPow(double x, int n) {
        double res = 1;
        for (int i = 0; i < n; ++i)
            res *= x;
        return res;
    }

    public double customFunction(double x, Vector<Boolean> v) {
        if (x <= 0)
            return ((((getTan(x, v.get(0)) + getCsc(x, v.get(1))) * getCsc(x, v.get(2))) / getCsc(x, v.get(3))) * getSec(x, v.get(4))) - (getTan(x, v.get(5)) * getTan(x, v.get(6)));
        else
            return getPow(getPow(((getLn(x, v.get(7)) / getLog_2(x, v.get(8))) / getLog_2(x, v.get(9))), 3, v.get(10)), 2, v.get(11)) - getLog_2(x, v.get(12));
    }
}

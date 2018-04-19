package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Vector;


public class CalculatorTests {
    private final double eps = 10e-6;
    private final Random rnd = new Random();
    private final Calculator calc = new Calculator();

    @Test
    public void random() {
        for (int i = 0; i < 10; ++i) {
            double u = rnd.nextDouble() * 10;
            assertTrue(Math.log(u) - calc.getLn(u) < eps, "u = " + u + "log(u) = " + Math.log(u) + "calc.getLog(u) = " + calc.getLn(u));
        }
    }

    @Test
    public void custom() {
        double u = 0.9126992424229672;
        assertTrue(Math.log(u) - calc.getLn(u) < eps, "u = " + u + "log(u) = " + Math.log(u) + "calc.getLog(u) = " + calc.getLn(u));
    }

    private Vector<Boolean> getVector(int x) {
        Vector<Boolean> res = new Vector<>();
        for (int i = 0; i < 13; ++i) {
            res.add(0 == x % 2);
            x /= 2;
        }
        return res;
    }

    @Test
    public void unit_test_all() {
        double u = 0.9126992424229672;
        for (int i = 0; i < 100; ++i) {
            u = rnd.nextDouble();
            assert (Math.abs(calc.getCos(u, true) - calc.getCos(u, false)) < eps);
            assert (Math.abs(calc.getSin(u, true) - calc.getSin(u, false)) < eps);
            assert (Math.abs(calc.getLn(u, true) - calc.getLn(u, false)) < eps);
            assert (Math.abs(calc.getLog_2(u, true) - calc.getLog_2(u, false)) < eps);
            assert (Math.abs(calc.getCsc(u, true) - calc.getCsc(u, false)) < eps);
            assert (Math.abs(calc.getSec(u, true) - calc.getSec(u, false)) < eps);
            assert (Math.abs(calc.getTan(u, true) - calc.getTan(u, false)) < eps);
        }

    }

    @Test
    public void custom_function() {
        double u = 0.9126992424229672;

        double value, value0, value1;
        value0 = calc.customFunction(u, getVector(0));
        value1 = calc.customFunction(u, getVector((int)Math.pow(2, 13)-1));
        for (int i = 0; i < Math.pow(2, 13); ++i) {
            Vector<Boolean> v = getVector(i);
            assertTrue(Math.abs(value0 - calc.customFunction(u, v)) < 100000*eps, "i = " + i +  " value0 = " + value0 + " calc.customF = " + calc.customFunction(u, v));
            //value = calc.customFunction(u, getVector(i));
        }
    }
}

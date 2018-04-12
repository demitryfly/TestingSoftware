package task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CalculatorTests {

    private final double eps = 10e-6;

    @Test
    public void integers() {
        Calculator calc = new Calculator();
        for (int i = -1000; i < 1000; ++i) {
            double u = (double) i;
            assertTrue(Math.abs(Math.cos(u) - calc.getCos(u)) < eps, "u = " + u);
        }
    }

    @Test
    public void extremes() {
        Calculator calc = new Calculator();
        for (int i = -1000; i < 1000; ++i) {
            double u = (double) i*(Math.PI/2);
            assertTrue(Math.abs(Math.cos(u) - calc.getCos(u)) < eps, "u = " + u);
        }
    }

    @Test
    public void random() {
        Calculator calc = new Calculator();
        Random rnd = new Random();
        for (int i = -1000; i < 1000; ++i) {
            double u = (double) i*rnd.nextDouble();
            assertTrue(Math.abs(Math.cos(u) - calc.getCos(u)) < eps, "u = " + u);
        }
    }
}

package task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.Random;


public class CalculatorTests {
    private final double eps = 10e-6;
    private Table table = new Table();

    @Test
    public void integers() {
        Calculator calc = new Calculator();
        for (int i = -1000; i < 1000; ++i) {
            double u = (double) i;
            System.out.println(i + ": " + table.getValue(i));
            System.out.println(i + ": " + Math.cos(u));
            System.out.println(i + ": " + calc.getCos(u));
            assertTrue(Math.abs(table.getValue(i) - calc.getCos(u)) < eps, "u = " + u);
        }
    }

    @Test
    public void extremes() {
        Calculator calc = new Calculator();
        for (int i = -1000; i < 1000; ++i) {
            double u = (double) i*(Math.PI/2);
            //assertTrue(Math.abs(table.getValue(u) - calc.getCos(u)) < eps, "u = " + u);
        }
    }
}

package task1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.Random;


public class CalculatorTests {
    private final double eps = 10e-6;
    private Table table = new Table();

    @Test
    public void standard() {
        Calculator calc = new Calculator();
        for (int i = 0; i < table.getSize(); ++i) {
            double u = table.getKey(i);

            System.out.println(i + ": " + u);
            System.out.println(i + ": " + Math.cos(u));
            System.out.println(i + ": " + calc.getCos(u));

            assertTrue(Math.abs(table.getValue(u) - calc.getCos(u)) < eps, "u = " + u);
        }
    }
}

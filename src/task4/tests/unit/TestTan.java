package task4.tests.unit;

import org.junit.jupiter.api.Test;
import task4.calculator.trigonometric.Cos;
import task4.calculator.trigonometric.Sin;
import task4.calculator.trigonometric.Tan;
import task4.tests.Table;
import task4.tests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTan extends Tests {

    {
        this.tan = new Tan(new Sin(), new Cos(new Sin()));
    }

    @Test
    public void test() {
        for (double x : Table.xNegative) {
            double y1 = this.tan.calc(x);
            double y2 = Table.tan.calc(x);
            assertTrue(Math.abs(y1 - y2) < eps, message(x, y1, y2));
        }
    }
}

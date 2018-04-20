package task4.tests.unit;

import org.junit.jupiter.api.Test;
import task4.calculator.logarithmic.Log;

import task4.tests.Table;
import task4.tests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLog extends Tests {

    {
        this.log = new Log();
    }

    @Test
    public void test() {
        for (double x : Table.xPositive) {
            double y1 = this.log.calc(x);
            double y2 = Table.log.calc(x);
            assertTrue(Math.abs(y1 - y2) < eps, message(x, y1, y2));
        }
    }
}

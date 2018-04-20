package task4.tests.unit;

import org.junit.jupiter.api.Test;

import task4.calculator.logarithmic.Log2;
import task4.tests.Table;
import task4.tests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLog2 extends Tests {

    {
        this.log2 = new Log2(Table.log);
    }

    @Test
    public void test() {
        for (double x : Table.xPositive) {
            double y1 = this.log2.calc(x);
            double y2 = Table.log2.calc(x);
            assertTrue(Math.abs(y1 - y2) < eps, message(x, y1, y2));
        }
    }
}

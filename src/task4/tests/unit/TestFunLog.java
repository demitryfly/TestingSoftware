package task4.tests.unit;

import org.junit.jupiter.api.Test;
import task4.calculator.logarithmic.FunLog;
import task4.calculator.logarithmic.Log;
import task4.calculator.logarithmic.Log2;
import task4.tests.Table;
import task4.tests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFunLog extends Tests {

    {
        this.funLog = new FunLog(new Log(), new Log2(new Log()));
    }


    @Test
    public void test() {
        for (double x : Table.xPositive) {
            double y1 = this.funLog.calc(x);
            double y2 = Table.funLog.calc(x);
            assertTrue(Math.abs(y1 - y2) < eps, message(x, y1, y2));
        }
    }


}


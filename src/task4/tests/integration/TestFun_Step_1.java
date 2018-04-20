package task4.tests.integration;

import org.junit.jupiter.api.Test;
import task4.calculator.Function;
import task4.tests.Table;
import task4.tests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFun_Step_1 extends Tests {
    {
        this.fun = new Function(Table.funLog, Table.funTrg);
    }

    @Test
    public void test() {
        for (double x : Table.xNegative) {
            double y1 = this.fun.calc(x);
            double y2 = Table.fun.calc(x);
            assertTrue(Math.abs(y1 - y2) < eps, message(x, y1, y2));
        }
    }
}

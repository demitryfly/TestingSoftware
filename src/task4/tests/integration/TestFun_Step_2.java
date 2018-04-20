package task4.tests.integration;

import org.junit.jupiter.api.Test;
import task4.calculator.Function;
import task4.calculator.logarithmic.FunLog;
import task4.calculator.trigonometric.*;
import task4.tests.Table;
import task4.tests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFun_Step_2 extends Tests {
    {
        this.funTrg = new FunTrg(Table.tan, Table.sec, Table.csc);
        this.funLog = new FunLog(Table.log, Table.log2);

        this.fun = new Function(funLog, funTrg);
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

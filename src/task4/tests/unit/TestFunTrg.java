package task4.tests.unit;

import org.junit.jupiter.api.Test;
import task4.calculator.trigonometric.*;
import task4.tests.Table;
import task4.tests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFunTrg extends Tests {
    {
        this.funTrg = new FunTrg(new Tan(new Sin(), new Cos(new Sin())), new Sec(new Cos(new Sin())), new Csc(new Sin()));
    }

    @Test
    public void test() {
        for (double x : Table.xNegative) {
            double y1 = this.funTrg.calc(x);
            double y2 = Table.funTrg.calc(x);
            assertTrue(Math.abs(y1 - y2) < eps, message(x, y1, y2));
        }
    }
}

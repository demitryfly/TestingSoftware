package task4.tests;

import org.junit.jupiter.api.Test;
import task4.calculator.logarithmic.*;
import task4.calculator.trigonometric.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import java.util.Vector;


public class UnitTests {
    private final double eps = 10e-6;
    private final Random rnd = new Random();

    private final Sin sin = new Sin();
    private final Cos cos = new Cos();
    private final Tan tan = new Tan();
    private final Csc csc = new Csc();
    private final Sec sec = new Sec();

    private final Log log = new Log();
    private final Log2 log2 = new Log2();


    @Test
    public void log() {
        for (int i = 0; i < 10; ++i) {
            double u = rnd.nextDouble() * 10;
            assertTrue(Math.log(u) - log.calc(u) < eps, "u = " + u + "log(u) = " + Math.log(u) + "calc.getLog(u) = " + log.calc(u));
        }
    }

    @Test
    public void custom() {
        double u = 0.9126992424229672;
        assertTrue(Math.log(u) - log.calc(u) < eps, "u = " + u + "log(u) = " + Math.log(u) + "calc.getLog(u) = " + log.calc(u));
    }

}

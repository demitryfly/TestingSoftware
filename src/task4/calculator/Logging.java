package task4.calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logging {
    private static final char SEPARATOR = ',';
    private static final char NEW_LINE = '\n';

    public static void writeLogFile(ICalculator module, double from,
                                      double to, double step, int number) {

        File file = new File(String.format("src/%s_%d.csv", module.getClass().getSimpleName(), number));


        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("X");
            br.write(SEPARATOR);
            br.write(module.getClass().getSimpleName() + "(X)");
            br.write(NEW_LINE);

            for (double i = from; i < to; i += step) {
                i = Math.rint(1000.0 * i) / 1000.0;
                br.write(String.valueOf(i));
                br.write(SEPARATOR);
                double res = module.calc(i);
                if (Math.abs(res) > 1000)
                    res = Double.POSITIVE_INFINITY;

                br.write(String.valueOf(res));
                br.write(NEW_LINE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

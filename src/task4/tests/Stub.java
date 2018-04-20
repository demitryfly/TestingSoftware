package task4.tests;

import task4.calculator.ICalculator;

import java.util.HashMap;

public class Stub implements ICalculator {

    private HashMap<Double, Double> table = new HashMap<>();

    public Stub() {
        this.table = new HashMap<>();
    }

    public Stub(HashMap<Double, Double> table) {
        this.table = table;
    }

    public void addPair(double x, double y) {
        table.put(x, y);
    }

    @Override
    public double calc(double x) {
        x = Math.round(1.e6 * x) / 1.e6;
        if (!table.containsKey(x))
            System.out.println("x  = " + x);

        assert table.containsKey(x);
        return table.get(x);
    }
}

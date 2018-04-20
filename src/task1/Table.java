package task1;

import java.util.HashMap;
import java.util.Vector;

public class Table {
    private HashMap<Double, Double> table = new HashMap<>();
    private Vector<Double> xs = new Vector<>();

    {
        table.put(-0.4, 0.9210609);
        table.put(-1.0, 0.5403023);
        table.put(-1.43, 0.1403316058);
        table.put(-1.7, -0.12884449);
        table.put(-2.06, -0.469923);
        table.put(-2.54, -0.8244352887);
        table.put(-3.42, -0.961494358);
        table.put(-3.87, -0.746235);
        table.put(-4.57, -0.1419083);
        table.put(-4.9, 0.1865123);
        table.put(-5.4, 0.634692);
        table.put(-5.9, 0.927478);

        xs.add(-0.4);
        xs.add(-1.0);
        xs.add(-1.43);
        xs.add(-1.7);
        xs.add(-2.06);
        xs.add(-2.54);
        xs.add(-3.42);
        xs.add(-3.87);
        xs.add(-4.57);
        xs.add(-4.9);
        xs.add(-5.4);
        xs.add(-5.9);
    }

    public double getValue(double key) {
        assert table.containsKey(key);

        return table.get(key);
    }

    public double getKey(int key) {
        return xs.get(key);
    }

    public int getSize() {
        return xs.size();
    }
}

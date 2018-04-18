package task1;

import java.util.HashMap;

public class Table {
    private HashMap<Integer, Double> table = new HashMap<>();

    public Table() {
        init();
    }

    private void init() {
        for (int i = -1000; i < 1000; ++i) {
            double u = (double) i;
            table.put(i, Math.cos(u));
        }
    }

    public double getValue(int key) {
        assert table.containsKey(key);

        return table.get(key);
    }
}

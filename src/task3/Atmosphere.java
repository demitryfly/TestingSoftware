package task3;

import java.util.Vector;

public class Atmosphere extends Visible {

    private Vector<Visible> items;

    {
        items = new Vector<>();
    }

    public void addItem(Visible item) {
        items.add(item);
    }

    @Override
    public void see(boolean deep) {

    }

    @Override
    public Atmosphere enlarge() {

        return null;
    }
}

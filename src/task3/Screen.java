package task3;

import java.util.Vector;

public class Screen extends Visible {
    private Visible visable;

    public Screen() {
        visable = null;
    }

    public Screen(Atmosphere atm) {
        this.visable = atm;
    }

    public Vector<Rocket> show() {
        Vector<Rocket> rockets = new Vector<>();
        for (int i = 0; i < 2; ++i) {
            rockets.add(new Rocket());
        }

        return rockets;
    }

    public void enlarge() {

    }

    @Override
    public void see(boolean deep) {

    }
}

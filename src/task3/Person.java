package task3;

public class Person extends Visible {
    private String name;
    private Shoulder shoulder;
    private Double attention;
    private Visible focus;

    {
        attention = 0.;
    }

    @Override
    public void see(boolean deep) {

    }

    public class Shoulder {
        public void put() {
            attention += 0.35;
        }
    };

    public Visible getFocus() {
        return focus;
    }

    public boolean tryShow(Visible focus) {
        if (attention < 1.)
            return false;

        this.focus = focus;
        return true;
    }

    public Shoulder getShoulder() {
        return shoulder;
    }

    public void setShoulder(Shoulder shoulder) {
        this.shoulder = shoulder;
    }

    public void doShock(Surprise surprise) {
        this.attention -= surprise.getSurprise();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

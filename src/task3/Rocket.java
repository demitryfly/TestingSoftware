package task3;

public class Rocket extends Visible {
    private Surprise surprise;

    {
        surprise = new Surprise(10.);
    }

    public enum Performance {
        SILVER_ARROW, ROCKET;
    }

    public String getType() {
        return "silver arrow";
    }

    public String getDeepType() {
        return "massive rocket";
    }

    public void enlarge() {

    }

    @Override
    public void shock(Person person) {
        person.doShock(this.surprise);
    }

    @Override
    public Performance see(boolean deep) {
        if (deep)
            return Performance.ROCKET;

        return Performance.SILVER_ARROW;
    }
}

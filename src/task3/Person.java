package task3;

public class Person extends Focus {
    private String name;
    private Focus focus;
    private Shoulder shoulder;
    private Double attention;

    {
        attention = 0.;
    }

    public class Shoulder {
        public void put() {
            attention += 0.35;
        }
    };

    public Focus getFocus() {
        return focus;
    }

    public boolean tryShow(Focus focus) {
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

    public void shock() {
        return;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

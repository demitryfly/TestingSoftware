package task3;

public class Rocket extends Focus {

    public enum FordState {
        START, AT_CONTROLLERS, GUESSED, HOLDING, RELEASED_HALF;
    }

    public String getType() {
        return "silver arrow";
    }

    public String getDeepType() {
        return "massive rocket";
    }

}

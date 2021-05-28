package model;

public class Ladder {

    int currentPossition;
    int nextpossition;

    public Ladder(int currentPossition, int nextpossition) {
        this.currentPossition = currentPossition;
        this.nextpossition = nextpossition;
    }

    public int getCurrentPossition() {
        return currentPossition;
    }

    public int getNextpossition() {
        return nextpossition;
    }
}

package model;

public class Chutes {

        int currentPosition;
        int nextposition;

    public Chutes(int currentPosition, int nextposition) {
        this.currentPosition = currentPosition;
        this.nextposition = nextposition;
    }


    public int getCurrentPosition() {
        return currentPosition;
    }

    public int getNextposition() {
        return nextposition;
    }
}

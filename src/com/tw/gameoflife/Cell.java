package com.tw.gameoflife;

public class Cell {

    private boolean state;

    public Cell(boolean state) {
        this.state = state;
    }

    public boolean inState() {
        return state;
    }

    public void revive() {
        this.state = true;
    }

    public void kill() {
        this.state = false;
    }
}

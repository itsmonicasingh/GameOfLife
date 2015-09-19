package com.tw.gameoflife;

public class Cell {

    private boolean alive = false;

    public boolean isAlive() {
        return alive;
    }

    public void revive() {
        this.alive = true;
    }

    public void kill() {
        this.alive = false;
    }
}

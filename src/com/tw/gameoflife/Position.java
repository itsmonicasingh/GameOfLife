package com.tw.gameoflife;

//has x and y coordinates and checks if two positions are identical
public class Position {

    private int x;
    private int y;

    public Position( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position that = (Position) o;
        if (x != that.x) {
            return false;
        }
        if (y != that.y) {
            return false;
        }
        return true;
    }
}

package com.tw.gameoflife;

public class Position {

    private int x;
    private int y;

    public Position( int x, int y )
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) {
            return true;
        }
        return false;
    }
}

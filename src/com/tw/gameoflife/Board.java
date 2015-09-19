package com.tw.gameoflife;

public class Board {

    private Cell[][] grid;

    public Board(Cell[][] grid) {
        this.grid = grid;
    }

    @Override
    public boolean equals(Object o) {
        {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            return true;
        }
    }
}

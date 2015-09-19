package com.tw.gameoflife;

public class Board {

    private Cell[][] grid;
    private int height;
    private int width;

    public Board(Cell[][] grid) {
        this.grid = grid;
        height = width = grid.length;
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

    public int neighboursCountAt(int row, int col) {
        int sum = 0;
        if (row == 0 && col == 0) {
            return 0;
        }
        return sum;
    }

}

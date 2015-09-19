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

    public boolean isAlive(int row, int col) {
        return grid[row][col].inState();
    }

    public int neighboursCountAt(int row, int col) {
        int sum = 0;
        if (row != 0 && col != 0) {
            if (isAlive(row - 1, col - 1)) {
                sum++;
            }
        }
        if (row != 0) {
            if (isAlive(row - 1, col)) {
                sum++;
            }
        }
        if (row != 0 && col != width - 1) {
            if (isAlive(row - 1, col + 1)) {
                sum++;
            }
        }
        if (col != 0) {
            if (isAlive(row, col - 1)) {
                sum++;
            }
        }
        if (col != width - 1) {
            if (isAlive(row, col + 1)) {
                sum++;
            }
        }
        if (row != height - 1 && col != 0) {
            if (isAlive(row + 1, col - 1)) {
                sum++;
            }
        }
        if (row != height - 1) {
            if (isAlive(row + 1, col)) {
                sum++;
            }
        }
        if (row != height - 1 && col != width - 1) {
            if (isAlive(row + 1, col + 1)) {
                sum++;
            }
        }
        return sum;
    }

}

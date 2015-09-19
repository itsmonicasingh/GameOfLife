package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void shouldBeEqualWhenComparingBoardToItself() {
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)}
        };
        Board board = new Board(cells);

        assertEquals(board, board);
    }

    @Test
    public void testGetNeighbours() {
        Cell[][] cells = {
                {new Cell(true)}
        };
        Board board = new Board(cells);

        assertEquals(0, board.neighboursCountAt(0,0));
    }

}


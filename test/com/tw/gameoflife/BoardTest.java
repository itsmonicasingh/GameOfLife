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
}


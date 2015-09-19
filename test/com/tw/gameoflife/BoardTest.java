package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void shouldBeEqualWhenComparingBoardToItself() {
        Board board = new Board();

        assertEquals(board, board);
    }
}

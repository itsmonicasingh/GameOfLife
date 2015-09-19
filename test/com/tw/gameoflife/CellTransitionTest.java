package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTransitionTest {

    @Test
    public void shouldReturnTheCurrentCell() {
        Cell cell = new Cell(false);
        CellTransition cellTransition = new CellTransition(cell);

        assertEquals(cell, cellTransition.currentState());
    }
}

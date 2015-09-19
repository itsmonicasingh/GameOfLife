package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class CellTest {

    @Test
    public void shouldReturnFalseAsCellIsDeadInitially() {
        Cell cell = new Cell();

        assertFalse(cell.isAlive());
    }
}
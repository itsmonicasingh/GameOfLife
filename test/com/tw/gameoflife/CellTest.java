package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void shouldReturnFalseAsCellIsDeadInitially() {
        Cell cell = new Cell();

        assertFalse(cell.isAlive());
    }

    @Test
    public void shouldReturnTrueAsAliveStatusWhenACellIsRevived() {
        Cell cell = new Cell();
        cell.revive();
        assertTrue(cell.isAlive());
    }
}
package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void shouldReturnFalseAsCellIsDeadInitially() {
        Cell cell = new Cell(false);

        assertFalse(cell.inState());
    }

    @Test
    public void shouldReturnTrueAsAliveStatusWhenACellIsRevived() {
        Cell cell = new Cell(true);
        cell.revive();
        assertTrue(cell.inState());
    }

    @Test
    public void shouldReturnAliveStatusAsFalseWhenCellIsKilled() {
        Cell cell = new Cell(false);
        cell.revive();
        cell.kill();
        assertFalse(cell.inState());
    }
}
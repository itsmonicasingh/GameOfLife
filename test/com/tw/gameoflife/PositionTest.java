package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void shouldBeEqualWhenComparingACoordinateToItself() {
        Position position = new Position(2,3);

        assertEquals(position, position);
    }
}

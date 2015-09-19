package com.tw.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PositionTest {

    @Test
    public void shouldBeEqualWhenComparingACoordinateToItself() {
        Position position = new Position(2,3);

        assertEquals(position, position);
    }

    @Test
    public void shouldBeUnEqualWhenComparingDifferentCoordinates() {
        Position position1 = new Position(0,0);
        Position position2 = new Position(1,2);

        assertNotEquals(position1, position2);
    }
}
